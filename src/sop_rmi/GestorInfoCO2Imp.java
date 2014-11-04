
package sop_rmi;

import cliente.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
import sensor.*;

public class GestorInfoCO2Imp extends UnicastRemoteObject implements GestorInfoCO2Int{
    
    ArrayList<SensorInt> sensores;
    ArrayList<SensorCllbckInt> callbacks;
    int contador;
    
    @SuppressWarnings("Convert2Diamond")
    public GestorInfoCO2Imp() throws RemoteException{
        super();
        sensores = new ArrayList<SensorInt>();
        callbacks = new ArrayList<SensorCllbckInt>();
        contador = 0;
    }

    public ArrayList<SensorInt> getSensores() {
        return sensores;
    }

    public ArrayList<SensorCllbckInt> getCallbacks() {
        return callbacks;
    }
    
    public int getContador(){
        return this.contador;
    }
    
    @Override//Implementado y verificado
    public boolean a_almacenarPorcentaje(SensorInt sensor) throws RemoteException {
        if(hacerCllbck(sensor.getSerie())){
            String cadena;
            cadena = sensor.getSerie() + "-" + sensor.getDia() + "-" + sensor.getMes() + "-" + sensor.getHora() + "-" + sensor.getPorcentajeCO2();
            agregarDato(cadena,true);
            System.out.println("echo: Medicion :"+ sensor.getPorcentajeCO2() + " del Sensor: " + sensor.getSerie() + " Agregada");
            return true;
        }else{
            return false;
        }
        
        
    }

    @Override//Implementado  y verificado
    public boolean registrarUsuario(UsuarioInt usuario) throws RemoteException {
        boolean result = false;
        
        
        boolean copy = false;
        ArrayList<UsuarioInt> usuarios = obtenerUsuarios();
        for(UsuarioInt u : usuarios){
            if(u.getLogin().compareTo(usuario.getLogin())==0 && u.getPassword().compareTo(usuario.getPassword())==0){
                copy = true;
            }
        }
        
        if(!copy){
            String login = usuario.getLogin();
            String password = usuario.getPassword();
            String cedula = Integer.toString(usuario.getCedula()); 
            String nombre  = usuario.getNombre();
            boolean rol = usuario.getAdmin();
            String cadena;
            if(rol){
                cadena = "1-" + login + "-" + password + "-" + cedula  + "-" + nombre;
            }else{
                cadena = "0-" + login + "-" + password + "-" + cedula  + "-" + nombre;
            }
            result = agregarUsuario(cadena,true);
        }
        
        return result;
    }

    @Override//Implementado  y verificado
    public int loginUsuario(String login, String password) throws RemoteException {
        /*
            -1: No esta registrado
            0: Registrado, login y password no coinciden
            1: UsuarioImp regular
            2: Admin
        */
        int result = -1;
        ArrayList<UsuarioInt> usuarios = obtenerUsuarios();
        for(UsuarioInt usuario : usuarios){
            if(login.compareTo(usuario.getLogin())==0 && password.compareTo(usuario.getPassword())==0){
                if(usuario.getAdmin()){
                    result = 2;
                }else{
                    result = 1;
                }
            }else if(login.compareTo(usuario.getLogin())==0 || password.compareTo(usuario.getPassword())==0){
                result = 0;
            }
        }
             
        return result;
    }
    
    @Override
    public boolean modificarUsuario(UsuarioInt viejo, UsuarioInt nuevo) throws RemoteException {
        boolean result;
        
        String cadenaN, cadenaV;
        
        if(viejo.getAdmin()){
            cadenaV = "1-" + viejo.getLogin() + "-" + viejo.getPassword() + "-" + viejo.getCedula()  + "-" + viejo.getNombre();
        }else{
            cadenaV = "0-" + viejo.getLogin() + "-" + viejo.getPassword() + "-" + viejo.getCedula()  + "-" + viejo.getNombre();
        }
        if(nuevo.getAdmin()){
            cadenaN = "1-" + nuevo.getLogin() + "-" + nuevo.getPassword() + "-" + nuevo.getCedula()  + "-" + nuevo.getNombre();
        }else{
            cadenaN = "0-" + nuevo.getLogin() + "-" + nuevo.getPassword() + "-" + nuevo.getCedula()  + "-" + nuevo.getNombre();
        }
        System.out.println(cadenaV);
        System.out.println(cadenaN);
        result = modificaUsuario(cadenaN, cadenaV);
        
        return result;
    }
    
    @Override//Implementado
    public String b_momentosMediaAltaDia(String mes, int dia, String hora) throws RemoteException {
        String result = "nada";
        
        contador = 0;
        double media = mediaDia(mes, dia);
        ArrayList<SensorInt> datosDia = datosDia(mes, dia);
        for(SensorInt s : datosDia){
            if(s.getPorcentajeCO2() > media && hora.compareTo(s.getHora()) == 0){
                result = s.getSerie() + "-" + s.getDia() + "-" + s.getMes() + "-" + s.getHora() + "-" + s.getPorcentajeCO2();
                contador++;
            }
        }
        
        return result;
    }

    @Override//Implementado
    public int c_totalHorasDeB() throws RemoteException {
        int result = -1;
        
        if(contador != 0){
            result = getContador();
        }
        
        return result;
    }

    @Override//Implementado
    public boolean d_modificarConcentracion(SensorInt sensor, Double porcentaje) throws RemoteException {
        boolean result;
            
        String cadenaN, cadenaV;
        cadenaV = sensor.getSerie() + "-" + sensor.getDia() + "-" + sensor.getMes() + "-" + sensor.getHora() + "-";
        cadenaN = sensor.getSerie() + "-" + sensor.getDia() + "-" + sensor.getMes() + "-" + sensor.getHora() + "-" + porcentaje;
        result = modificarDato(cadenaN, cadenaV);
        
        return result;
    }

    @Override//Implementado
    public String e_mostrarLecturas(String mes, int dia, String hora) throws RemoteException {
        String result="";
        ArrayList<SensorInt> datos = datosDia(mes, dia);
        for(SensorInt s: datos){
            if(hora.compareTo(s.getHora()) == 0){
                result = s.getSerie() + "-" + s.getDia() + "-" + s.getMes() + "-" + s.getHora() + "-" + s.getPorcentajeCO2();
            }
        }
        return result;
    }

    @Override//Implementado
    public String f_mediaMasAltaMes(String mes) throws RemoteException {
        String result;
        
        int nDias = diasMes(mes);
        @SuppressWarnings("Convert2Diamond")
        ArrayList<Double> medias = new ArrayList<Double>();
        for(int i=1; i<=nDias; i++){
            medias.add(mediaDia(mes, i));
        }
        Double aux = 0.0;
        for(Double m : medias){
            if(m>aux){
                aux = m;
            }
        }
        int dia = medias.indexOf(aux)+1;
        result = dia + " de " + mes + " --> " + aux;
        return result;
    }

    @Override//Implementado
    public void registrarCllbck(SensorCllbckInt sensor) throws RemoteException {
        if((this.callbacks).size()<3 && !callbacks.contains(sensor)){
            (this.callbacks).add(sensor);
        }
    }

    @Override
    public boolean hacerCllbck(int serial) throws RemoteException {
        boolean result = false;
        for(SensorCllbckInt cb : callbacks){
            if(cb.getId() == serial){
               result = cb.getEstado();
            }
        }
        return result;
    }
    
    @Override
    public String catcha() throws RemoteException {
        String cadenaAleatoria = "";
        long milis = new java.util.GregorianCalendar().getTimeInMillis();
        Random r = new Random(milis);
        int i = 0;
        while ( i < 8){
        char c = (char)r.nextInt(255);
        if ( (c >= '0' && c <='9') || (c >='A' && c <='Z') ){
        cadenaAleatoria += c;
        i ++;
        }
        }
        return cadenaAleatoria;
    }
    
    @Override
    public UsuarioInt obtenerUsuarioL(int cedula){
            @SuppressWarnings("Convert2Diamond")
            UsuarioInt result = new UsuarioImp();

            FileReader archivo = null;
            String linea;
            StringTokenizer st;
            try {
                archivo = new FileReader("Usuarios.txt");
                BufferedReader lector = new BufferedReader(archivo);
                while ((linea = lector.readLine()) != null) {
                    st = new StringTokenizer(linea,"-",false);
                    UsuarioImp aux = (UsuarioImp)formarUsuario(st);
                    if(aux.getCedula() == cedula){
                        result = aux;
                    }
                }
            }catch (FileNotFoundException e) {
                throw new RuntimeException(e + ": Archivo no encontrado");
            }catch (IOException e) {
                throw new RuntimeException(e + ": Ocurrio un error de entrada/salida");
            }finally {
                if (archivo != null) {
                    try {
                        archivo.close();
                    }catch (IOException e) {
                        System.out.println(e+": Error tratando de cerrar Archivo Usuarios.txt");
                    }
                }
            }

            return result;
        }
    
    @Override
    public UsuarioInt obtenerUsuarioToList(int pos){
        UsuarioInt result = null;
        
        ArrayList<UsuarioInt> lista = obtenerUsuarios();
        
        if(pos<lista.size()){
            result = lista.get(pos);
        }
        
        return result;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Metodos Auxiliares">
    
        // <editor-fold defaultstate="collapsed" desc="Para Usuarios">
    
        public boolean agregarUsuario(String cadena, boolean rw) {
            boolean result = false;

            FileWriter fichero = null;
            PrintWriter pw;
            try
            {
                fichero = new FileWriter("Usuarios.txt", rw);
                pw = new PrintWriter(fichero);
                pw.println(cadena);

            } catch (IOException e) {
                System.out.println(e + ": Error registrando Usuario");
            } finally {
               try {
               if (null != fichero){
                  fichero.close();
                  result = true;
               }
               } catch (IOException e2) {
                   System.out.println(e2+": Error tratando de cerrar Archivo Usuarios.txt");
               }
            }

            return result;
        }

        public ArrayList<UsuarioInt> obtenerUsuarios(){
            @SuppressWarnings("Convert2Diamond")
            ArrayList<UsuarioInt> result = new ArrayList<UsuarioInt>();

            FileReader archivo = null;
            String linea;
            StringTokenizer st;
            try {
                archivo = new FileReader("Usuarios.txt");
                BufferedReader lector = new BufferedReader(archivo);
                while ((linea = lector.readLine()) != null) {
                    st = new StringTokenizer(linea,"-",false);
                    result.add((UsuarioImp)formarUsuario(st));
                }
            }catch (FileNotFoundException e) {
                throw new RuntimeException(e + ": Archivo no encontrado");
            }catch (IOException e) {
                throw new RuntimeException(e + ": Ocurrio un error de entrada/salida");
            }finally {
                if (archivo != null) {
                    try {
                        archivo.close();
                    }catch (IOException e) {
                        System.out.println(e+": Error tratando de cerrar Archivo Usuarios.txt");
                    }
                }
            }

            return result;
        }

        public UsuarioInt formarUsuario(StringTokenizer st){
            UsuarioInt u = new UsuarioImp();

            ArrayList tokens = new ArrayList();
            while (st.hasMoreTokens()){  
                tokens.add(st.nextToken());   
            }
            int admin = Integer.parseInt((String)tokens.get(0));
            String login = (String)tokens.get(1);
            String password = (String)tokens.get(2);
            String cedula = (String)tokens.get(3);
            String nombre = (String)tokens.get(4);

            if(admin == 1){
                u.setAdmin(true);
            }else{
                u.setAdmin(false);
            }
            u.setLogin(login);
            u.setPassword(password);
            u.setCedula(Integer.parseInt(cedula));
            u.setNombre(nombre);

            return u;
        }
        
        public boolean modificaUsuario(String cadenaN, String cadenaV){
            boolean result = false;
            
            ArrayList<UsuarioInt> datos = obtenerUsuarios();
            String cadenaA;
            boolean rw = false;
            for(UsuarioInt usuario : datos){
                if(usuario.getAdmin()){
                    cadenaA = "1-" + usuario.getLogin() + "-" + usuario.getPassword() + "-" + usuario.getCedula()  + "-" + usuario.getNombre();
                }else{
                    cadenaA = "0-" + usuario.getLogin() + "-" + usuario.getPassword() + "-" + usuario.getCedula()  + "-" + usuario.getNombre();
                }
                if(cadenaA.compareTo(cadenaV) == 0){
                    result = agregarUsuario(cadenaN,rw);
                }else{
                    result = agregarUsuario(cadenaA,rw);
                }
                rw = true;
            }
            
            return result;
        }
        
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Para Datos">
        
        public boolean agregarDato(String cadena, boolean rw) {
            boolean result = false;

            FileWriter fichero = null;
            PrintWriter pw;
            try
            {
                fichero = new FileWriter("Mediciones.txt", rw);
                pw = new PrintWriter(fichero);
                pw.println(cadena);

            } catch (IOException e) {
                System.out.println(e + ": Error registrando Usuario");
            } finally {
               try {
               if (null != fichero){
                  fichero.close();
                  result = true;
               }
               } catch (IOException e2) {
                   System.out.println(e2+": Error tratando de cerrar Archivo Usuarios.txt");
               }
            }

            return result;
        }
        
        public ArrayList<SensorInt> obtenerDatos(){
            ArrayList<SensorInt> result = new ArrayList<SensorInt>();

            FileReader archivo = null;
            String linea;
            StringTokenizer st;
            try {
                archivo = new FileReader("Mediciones.txt");
                BufferedReader lector = new BufferedReader(archivo);
                while ((linea = lector.readLine()) != null) {
                    st = new StringTokenizer(linea,"-",false);
                    result.add((SensorImp)formarDato(st));
                }
            }catch (FileNotFoundException e) {
                throw new RuntimeException(e + ": Archivo no encontrado");
            }catch (IOException e) {
                throw new RuntimeException(e + ": Ocurrio un error de entrada/salida");
            }finally {
                if (archivo != null) {
                    try {
                        archivo.close();
                    }catch (IOException e) {
                        System.out.println(e+": Error tratando de cerrar Archivo Usuarios.txt");
                    }
                }
            }

            return result;
        }

        public SensorInt formarDato(StringTokenizer st){
            SensorInt s = new SensorImp();

            ArrayList tokens = new ArrayList();
            while (st.hasMoreTokens()){  
                tokens.add(st.nextToken());   
            }
            
            int serie = Integer.parseInt((String)tokens.get(0));
            int dia = Integer.parseInt((String)tokens.get(1));
            String mes = (String)tokens.get(2);
            String hora = (String)tokens.get(3);
            Double porcentaje = Double.parseDouble((String)tokens.get(4));

            s.setSerie(serie);
            s.setDia(dia);
            s.setMes(mes);
            s.setHora(hora);
            s.setPorcentajeCO2(porcentaje);
            return s;
        }
        
        public ArrayList<SensorInt> datosDia(String mesInt, int dia){
            ArrayList<SensorInt> result = new ArrayList<SensorInt>();
            String mes = mesInt.toLowerCase();
            ArrayList<SensorInt> datos = obtenerDatos();
            String mes2;
            for(SensorInt s : datos){
                mes2 = s.getMes().toLowerCase();
                if( (s.getDia() == dia) && mes.compareTo(mes2)==0 ){
                    result.add(s);
                }
            }

            return result;
        }
    
        public Double mediaDia(String mesInt, int dia){
            Double result = 0.0;
            
            ArrayList<SensorInt> datosDia = datosDia(mesInt, dia);
            for(SensorInt d : datosDia){
                result += d.getPorcentajeCO2()/24;
            }

            return result;
        }
        
        public boolean modificarDato(String cadenaN, String cadenaV){
            boolean result = false;
            
            ArrayList<SensorInt> datos = obtenerDatos();
            String cadenaA;
            boolean rw = false;
            for(SensorInt sensor : datos){
                cadenaA = sensor.getSerie() + "-" + sensor.getDia() + "-" + sensor.getMes() + "-" + sensor.getHora() + "-" + sensor.getPorcentajeCO2();
                if(cadenaA.contains(cadenaV)){
                    result = agregarDato(cadenaN,rw);
                }else{
                    result = agregarDato(cadenaA,rw);
                }
                rw = true;
            }
            
            return result;
        }
        
        // </editor-fold> 
        
        public static int diasMes(String mesInt){
            int result;
            String mes = mesInt.toLowerCase();
            switch (mes){
                case "febrero":
                    result = 28;
                    break;
                case "abril": case "junio":
                case "septiembre": case "noviembre":
                    result = 30;
                    break;
                default:
                    result = 31;
                    break;
            }
            return result;
        }
        
    // </editor-fold> 

    

    
    
}
