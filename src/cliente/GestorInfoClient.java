
package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import sensor.SensorInt;
import sop_rmi.*;

public class GestorInfoClient {
    static GestorInfoCO2Int obj;
    
    public GestorInfoClient(String ip, String puerto){ 
        try{
            obj = (GestorInfoCO2Int)Naming.lookup("rmi://"+ip+":"+puerto+"/gestorInfoSx");
        }catch(MalformedURLException | NotBoundException | RemoteException e){
            System.out.println("Excepcion: "+e);
        }
    }
    
    public boolean registrarUsuario(UsuarioInt usuario) throws RemoteException{
        boolean result;
        
        result = obj.registrarUsuario(usuario);
        
        return result;
    }
    
    public int loginUsuario(String login, String password) throws RemoteException{
        int result;
        
        result = obj.loginUsuario(login, password);
        
        return result;
    }
    
    public boolean modificarUsuario(UsuarioInt viejo, UsuarioInt nuevo) throws RemoteException{
        boolean result;
        
        result = obj.modificarUsuario(viejo, nuevo);
        
        return result;
    }
    
    public ArrayList punto_b(String mes, int dia) throws RemoteException{
        ArrayList result = new ArrayList();
        
        for(int i=0; i<24; i++){
            String hora = formarHora(i);
            String cadena = obj.b_momentosMediaAltaDia(mes, dia, hora);
            if(cadena.compareTo("nada") != 0){
                result.add(cadena);
            }
            
        }
        
        return result;
    }
    
    public int punto_c() throws RemoteException{
        int result;
        
        result = obj.c_totalHorasDeB();
        
        return result;
    }
    
    public boolean punto_d(SensorInt sensor, Double porcentaje) throws RemoteException{
        boolean result;
        
        result = obj.d_modificarConcentracion(sensor, porcentaje);
        
        return result;
    }
    
    public ArrayList<String> punto_e(String mes, int dia) throws RemoteException{
        ArrayList<String> result = new ArrayList<String>();
        String hora;
        for(int i=0; i<24; i++){
            hora = formarHora(i);
            String cadena = obj.e_mostrarLecturas(mes, dia, hora);
            result.add(cadena);
        }
        
        return result;
    }
    
    public String punto_f(String mes) throws RemoteException{
        String result;
        
        result = obj.f_mediaMasAltaMes(mes);
        
        return result;
    }
    
    public String formarHora(int hora){
        String result;
        
        if(hora<10){
            result = "0"+hora+":00";
        }else{
            result = hora+":00";
        }
        
        return result;
    }
    
    public String compCatcha() throws RemoteException{
        String result;
        
        result = obj.catcha();
        
        return result;
    }
    
    public UsuarioInt obtenerUsuarios(int cedula) throws RemoteException{
        UsuarioInt usuario;
        
        usuario = obj.obtenerUsuarioL(cedula);
        
        return usuario;
    }
    
    public ArrayList<UsuarioInt> listaUsuario() throws RemoteException{
        ArrayList<UsuarioInt> result = new ArrayList<UsuarioInt>();
        
        for(int i=0; i<999; i++){
            UsuarioInt usuario = obj.obtenerUsuarioToList(i);
            if(usuario != null){
                result.add(usuario);
            }else{
                i = 9999;
            }
        }
        
        
        return result;
    }

}
