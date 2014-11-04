
package sensor;

import java.io.Serializable;

public interface SensorInt extends Serializable{


    void setSerie(int serie);

    void setDia(int dia);

    void setMes(String mes);

    void setHora(String hora);

    void setPorcentajeCO2(Double porcentajeCO2);

    void setEstado(boolean estado);
    
    int getSerie();

    int getDia();

    String getMes();

    String getHora();

    Double getPorcentajeCO2();

    boolean getEstado();
    
    int numMes(String mes);
}
