/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Javier
 */
public class Tarjetas extends Users{
    protected String numTarjeta;

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    
    public Tarjetas() {
        this.correo = "";
        this.nombre = "";
        this.apellido ="";
        this.contraseña = "";
        this.dpi = "";
        this.fechaNacimiento = "";
        this.genero = "";
        this.nacionalidad = "";
        this.alias = "";
        this.telefono = "";
        this.rol = "";
        this.img = "";
        this.numTarjeta = "";
    }
    
    public Tarjetas(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    
    public Tarjetas(String numTarjeta, String nombre, String apellido, String correo) {
        super(nombre, apellido, correo);
        this.numTarjeta = numTarjeta;
    }

    public Tarjetas(String numTarjeta, String correo, String nombre, String apellido, String contraseña, String dpi, String fechaNacimiento, String genero, String nacionalidad, String alias, String telefono, String rol, String img) {
        super(correo, nombre, apellido, contraseña, dpi, fechaNacimiento, genero, nacionalidad, alias, telefono, rol, img);
        this.numTarjeta = numTarjeta;
    }


}
