package servidor;

import java.net.MalformedURLException;
import sop_rmi.*;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GestorInfoServer{
	public static void main(String args[]){
		try{
			GestorInfoCO2Imp obj = new GestorInfoCO2Imp();
			System.out.println("Objeto Instanciado: " + obj);
			Naming.rebind("rmi://"+args[0]+":"+args[1]+"/gestorInfoSx",obj);
			System.out.println("gestorInfoSx registrado");
                        GUI_AdministrarSensores Admin = new GUI_AdministrarSensores(obj);
                        Admin.setVisible(true);
		}catch (MalformedURLException | RemoteException e){
			System.out.println(e);
		}
	}
} 