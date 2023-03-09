/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Javier
 */
public class Regiones {
    protected String nomRegion;
    protected String codRegion;
    protected double preEstandar;
    protected double preEspecial;

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public String getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(String codRegion) {
        this.codRegion = codRegion;
    }

    public double getPreEstandar() {
        return preEstandar;
    }

    public void setPreEstandar(double preEstandar) {
        this.preEstandar = preEstandar;
    }

    public double getPreEspecial() {
        return preEspecial;
    }

    public void setPreEspecial(double preEspecial) {
        this.preEspecial = preEspecial;
    }


    
    public Regiones() {
        this.nomRegion = "";
        this.codRegion = "";
        this.preEstandar = 0.00;
        this.preEspecial = 0.00;
    }
    
    public Regiones(String nomRegion, String codRegion, double preEstandar, double preEspecial){
        this.nomRegion = nomRegion;
        this.codRegion = codRegion;
        this.preEstandar = preEstandar;
        this.preEspecial = preEspecial;
    }
}
