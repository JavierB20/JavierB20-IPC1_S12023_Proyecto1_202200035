/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ipc1_proyecto1;

import Class.KioskoC;
import Class.Regiones;
import Class.Tarjetas;
import Class.Users;
import GUI.Login;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class IPC1_Proyecto1 {
    
    public static ArrayList<Users> usuarios = new ArrayList<Users>();
    public static ArrayList<KioskoC> kioskos = new ArrayList<KioskoC>();
    public static ArrayList<Regiones> regiones = new ArrayList<Regiones>();
    public static ArrayList<Tarjetas> tarjetas = new ArrayList<Tarjetas>();
    

    public ArrayList<Users> getArreglo() {
        return usuarios;
    }

   public ArrayList<KioskoC> getArregloK() {
       return kioskos;
   }

   public ArrayList<Regiones> getArregloR(){
       return regiones;
   }
   
   public ArrayList<Tarjetas> getArregloT(){
       return tarjetas;
   }
            
    public static void main(String[] args) {

        //Datos quemados
        Users admin = new Users("ipc1_202200035@ipc1delivery.com","Jose Javier","Bonilla Salazar","202200035","5689899370101","29/01/2023","Masculino","guatemalteco","Jerry","98642135","Administrador","img"); 
       
        Regiones reg1 = new Regiones("Metropolitana","M",35,25);
        Regiones reg2 = new Regiones("Norte","NT",68.50,45.55);
        Regiones reg3 = new Regiones("Nororiente","NO",58.68,35.48);
        Regiones reg4 = new Regiones("Suroriente","SO",38.68,32.48);
        Regiones reg5 = new Regiones("Suroccidente","SOC",34,29);
        Regiones reg6 = new Regiones("Noroccidente","NOC",44.50,40);
        
        usuarios.add(admin);
        
        regiones.add(reg1);
        regiones.add(reg2);
        regiones.add(reg3);
        regiones.add(reg4);
        regiones.add(reg5);
        regiones.add(reg6);
        
        Login login = new Login();
        login.setVisible(true);
    }
}
