package Class;

import java.util.ArrayList;

import com.mycompany.ipc1_proyecto1.IPC1_Proyecto1;


/**
 *
 * @author Javier
 */
public class Listas {

    IPC1_Proyecto1 lista = new IPC1_Proyecto1();
    ArrayList<Users> lstUsuario;

    public Listas() {
        lstUsuario = lista.getArreglo();
    }

    public boolean validarUsuario(String user, String password){
        for (Users u : lstUsuario) {
            if(u.getCorreo().equals(user) && u.getContraseña().equals(password)) {
                return true;
            }
        }
        return false;
    }


}
