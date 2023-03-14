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

    public String validarUsuario(String user, String password){
        for (Users u : lstUsuario) {
            if(u.getCorreo().equals(user) && u.getContraseña().equals(password) && u.getRol().equals("Administrador")) {
                return "admin";
            }
            else if(u.getCorreo().equals(user) && u.getContraseña().equals(password) && u.getRol().equals("Individual")) {
                return "individual";
            }
            else if(u.getCorreo().equals(user) && u.getContraseña().equals(password) && u.getRol().equals("Kiosko")) {
                return "kiosko";
            }
        }
        return "incorrecto";
    }

        public String obtnerNombre(String user){
        for (Users u : lstUsuario) {
            if(u.getCorreo().equals(user) ) {
                String usuario = u.getNombre();
                return usuario;
            }
        }
        return "";
    }
        
    public String obtnerApellido(String user){
        for (Users u : lstUsuario) {
            if(u.getCorreo().equals(user) ) {
                String apellido = u.getApellido();
                return apellido;
            }
        }
        return "";
    }
    
        public String validarRol(String user){
        for (Users u : lstUsuario) {
            if(u.getCorreo().equals(user) && u.getRol().equals("Administrador")) {
                return "admin";
            }
            else if(u.getCorreo().equals(user) && u.getRol().equals("Individual")) {
                return "individual";
            }
            else if(u.getCorreo().equals(user) && u.getRol().equals("Kiosko")) {
                return "kiosko";
            }
        }
        return "incorrecto";
    }


}
