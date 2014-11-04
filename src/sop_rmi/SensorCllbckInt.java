
package sop_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SensorCllbckInt extends Remote{
    public int getId() throws RemoteException;
    public void setId(int id) throws RemoteException;
    public boolean getEstado() throws RemoteException;
    public void setEstado(boolean estado) throws RemoteException;
    public void apagarSensor() throws RemoteException;
}
