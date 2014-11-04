
package sensor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import sop_rmi.*;

public class SensorClient {
    public static void main(String args[]){
        try{
            boolean estadoSensor = true;
            GestorInfoCO2Int obj = (GestorInfoCO2Int)Naming.lookup("rmi://"+args[0]+":"+args[1]+"/gestorInfoSx");
            SensorCllbckInt cllbck = new SensorCllbckImp();
            cllbck.setEstado(true);
            Scanner leer = new Scanner(System.in);
            int serial, uTiempo;
            int dia=1, mes=1, hora=0;
            System.out.print("Ingrese Serial del Sensor: ");
            serial = Integer.parseInt(leer.next());
            System.out.print("Ingrese unidad de tiempo (seg) para realizar las mediciones: ");
            uTiempo = Integer.parseInt(leer.next());
            SensorInt sensor = new SensorImp();
            sensor.setSerie(serial);
            cllbck.setId(serial);
            sensor.setEstado(true);
            //Ciclo que almacena los datos del sensor en el Servidor indefinidamente
            while(true){
                if(diasMes(mes)>=dia){
                    if(hora < 24){
                        sensor.setHora(getHora(hora));
                        sensor.setDia(dia);
                        sensor.setMes(nomMes(mes));
                        Double valor = generarPorcentaje(uTiempo);
                        sensor.setPorcentajeCO2(valor);
                        obj.registrarCllbck( (SensorCllbckInt)cllbck );
                        estadoSensor = obj.a_almacenarPorcentaje(sensor);
                        while(!estadoSensor){
                            estadoSensor = obj.a_almacenarPorcentaje(sensor);
                        }
                        System.out.println("Medicion Obtenida por el sensor: " + valor);
                        hora++;
                    }else{
                        hora = 0;
                        dia++;
                    }
                }else{
                    dia = 1;
                    mes++;
                }
            }
        }catch(MalformedURLException | NotBoundException | RemoteException e){
            System.out.println("Excepcion: "+e);
        }
    }
    
    // Funcion que genera un valor aleatorio y pausa la ejecucion el tiempo ingresado en segundos
    public static Double generarPorcentaje(int seg){
        Double result = 0.003;
        seg = seg * 1000;
        try{
            result = Math.random()*0.07 + 0.03;
            result = Math.rint(result*1000)/1000;
            Thread.sleep(seg);
        }catch(InterruptedException e){}
        
        return result;
    }
    
    // Funcion que formatea el mes en un String
    public static String nomMes(int mes){
        String result = "";
        
        switch (mes){
            case 1:
                result = "Enero";
                break;
            case 2:
                result = "Febrero";
                break;
            case 3:
                result = "Marzo";
                break;
            case 4:
                result = "Abril";
                break;
            case 5:
                result = "Mayo";
                break;
            case 6:
                result = "Junio";
                break;
            case 7:
                result = "Julio";
                break;
            case 8:
                result = "Agosto";
                break;
            case 9:
                result = "Septiembre";
                break;
            case 10:
                result = "Octubre";
                break;
            case 11:
                result = "Noviembre";
                break;    
            case 12:
                result = "Diciembre";
                break;  
        }
        
        return result;
    }
    
    // Funcion que retorna el total de dias del mes ingresado
    public static int diasMes(int mes){
        int result;
        switch (mes){
            case 2:
                result = 28;
                break;
            case 4: case 6:
            case 9: case 11:
                result = 30;
                break;
            default:
                result = 31;
                break;
        }
        return result;
    }
    
    // Funcion que formatea la hora en un String 
    public static String getHora(int h){
        String result;
        
        if(h<10){
            result = "0"+h+":00";
        }else{
            result = h+":00";
        }
        
        return result;
    }
}
