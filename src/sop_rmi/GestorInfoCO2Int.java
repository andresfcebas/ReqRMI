
package sop_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import sensor.SensorInt;
import cliente.*;

public interface GestorInfoCO2Int extends Remote{
    public boolean a_almacenarPorcentaje(SensorInt sensor) throws RemoteException;
    
    public boolean registrarUsuario(UsuarioInt usuario) throws RemoteException;
    public int loginUsuario(String login, String password) throws RemoteException;
    public boolean modificarUsuario(UsuarioInt viejo, UsuarioInt nuevo) throws RemoteException;
    
    public String b_momentosMediaAltaDia(String mes, int dia, String hora) throws RemoteException;
    public int c_totalHorasDeB() throws RemoteException;
    public boolean d_modificarConcentracion(SensorInt sensor, Double porcentaje) throws RemoteException;
    
    public String e_mostrarLecturas(String mes, int dia, String hora) throws RemoteException;
    public String f_mediaMasAltaMes(String mes) throws RemoteException;
    
    public void registrarCllbck(SensorCllbckInt sensor) throws RemoteException;
    public boolean hacerCllbck(int serial) throws RemoteException;
    
    public String catcha() throws RemoteException;
    public UsuarioInt obtenerUsuarioL(int cedula) throws RemoteException;
    public UsuarioInt obtenerUsuarioToList(int pos) throws RemoteException;
}