/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Javier
 */
public class KioskoC {
    
        protected String codKiosco;
    protected String nomKiosco;
    protected String codRegion;

    public String getCodKiosco() {
        return codKiosco;
    }

    public void setCodKiosco(String codKiosco) {
        this.codKiosco = codKiosco;
    }

    public String getNomKiosco() {
        return nomKiosco;
    }

    public void setNomKiosco(String nomKiosco) {
        this.nomKiosco = nomKiosco;
    }

    public String getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(String codRegion) {
        this.codRegion = codRegion;
    }
    
    public KioskoC() {
        this.codKiosco = "";
        this.nomKiosco = "";
        this.codRegion = "";
    }
    
    public KioskoC(String codKiosco, String nomKiosco, String codRegion) {
        this.codKiosco = codKiosco;
        this.nomKiosco = nomKiosco;
        this.codRegion = codRegion;
    }
}
