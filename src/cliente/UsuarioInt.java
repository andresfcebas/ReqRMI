
package cliente;

import java.io.Serializable;

public interface UsuarioInt extends Serializable{
    void setCedula(int cedula);

    void setNombre(String nombre);

    void setLogin(String login);

    void setPassword(String password);

    void setAdmin(boolean admin);
    
    int getCedula();

    String getNombre();

    String getLogin();

    String getPassword();

    boolean getAdmin();
    
}
