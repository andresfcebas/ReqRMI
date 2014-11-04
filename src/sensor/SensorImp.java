
package sensor;

public class SensorImp implements SensorInt{
    private int serie;
    private int dia;
    private String mes;
    private String hora;
    private Double porcentajeCO2;
    private boolean estado;

    @Override
    public void setSerie(int serie) {
        this.serie = serie;
    }

    @Override
    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public void setMes(String mes) {
        this.mes = mes;
        
    }

    @Override
    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public void setPorcentajeCO2(Double porcentajeCO2) {
        this.porcentajeCO2 = porcentajeCO2;
    }

    @Override
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public int getSerie() {
        return serie;
    }

    @Override
    public int getDia() {
        return dia;
    }

    @Override
    public String getMes() {
        return mes;
    }

    @Override
    public String getHora() {
        return hora;
    }

    @Override
    public Double getPorcentajeCO2() {
        return porcentajeCO2;
    }

    @Override
    public boolean getEstado() {
        return estado;
    }
    
    @Override
    public int numMes(String mes){
        int result = -1;
        
        String opcion = mes.toLowerCase();
        
        switch (opcion){
            case "enero":
                result = 1;
                break;
            case "febrero":
                result = 2;
                break;
            case "marzo":
                result = 3;
                break;
            case "abril":
                result = 4;
                break;
            case "mayo":
                result = 5;
                break;
            case "junio":
                result = 6;
                break;
            case "julio":
                result = 7;
                break;
            case "agosto":
                result = 8;
                break;
            case "septiembre":
                result = 9;
                break;
            case "octubre":
                result = 10;
                break;
            case "noviembre":
                result = 11;
                break;    
            case "diciembre":
                result = 12;
                break;  
        }
        
        return result;
    } 
}
