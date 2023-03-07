/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ipc1_proyecto1;

import Class.KioskoC;
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

            public ArrayList<Users> getArreglo() {
            return usuarios;
        }
            
           public ArrayList<KioskoC> getArregloK() {
               return kioskos;
           }
            
    public static void main(String[] args) {


        
        Users admin = new Users("ipc1_202200035@ipc1delivery.com","Jose Javier","Bonilla Salazar","202200035","5689899370101","29/01/2023","Masculino","guatemalteco","Jerry","98642135","Administrador","img"); 
        
        usuarios.add(admin);
        
        Login login = new Login();
        login.setVisible(true);
    }
}
