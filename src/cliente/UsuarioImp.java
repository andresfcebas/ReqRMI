
package cliente;

public class UsuarioImp implements UsuarioInt{
    
    private int cedula;
    private String nombre;
    private String login;
    private String password;
    private boolean admin;

    @Override
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    @Override
    public int getCedula() {
        return cedula;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean getAdmin() {
        return admin;
    }
    
}
