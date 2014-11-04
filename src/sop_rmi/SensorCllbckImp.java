
package sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SensorCllbckImp extends UnicastRemoteObject implements SensorCllbckInt{
    private int id;
    private boolean estado;
    public SensorCllbckImp() throws RemoteException{
        super();
    }

    @Override
    public void apagarSensor() throws RemoteException {
        setEstado(false);
    }

    @Override
    public int getId() throws RemoteException {
        return this.id;
    }

    @Override
    public void setId(int id) throws RemoteException {
        this.id = id;
    }

    @Override
    public boolean getEstado() throws RemoteException {
        return this.estado;
    }

    @Override
    public void setEstado(boolean estado) throws RemoteException {
        this.estado = estado;
    }
    
}
