/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Users {
        
    protected String correo;
    protected String nombre;
    protected String apellido;
    protected String contraseña;
    protected String dpi;
    protected String fechaNacimiento;
    protected String genero;
    protected String nacionalidad;
    protected String alias;
    protected String telefono;
    protected String rol;
    protected String img;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    public Users() {
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
    }
    
    public Users(String correo, String nombre, String apellido, String contraseña, String dpi, String fechaNacimiento,
            String genero, String nacionalidad, String alias, String telefono, String rol, String img) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.dpi = dpi;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.alias = alias;
        this.telefono = telefono;
        this.rol = rol;
        this.img = img;
    }
    

    
}
