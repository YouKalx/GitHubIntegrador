/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author ShuKalx
 */
public class Horario {
    String codho, tur, hoini, hofin, lun, mar, mie, jue, vie;
    
    public Horario(){
        
    }
    
    public Horario(String codho, String tur, String hoini, String hofin, String lun, String mar, String mie, String jue, String vie) {
        this.codho = codho;
        this.tur = tur;
        this.hoini = hoini;
        this.hofin = hofin;
        this.lun = lun;
        this.mar = mar;
        this.mie = mie;
        this.jue = jue;
        this.vie = vie;
    }

    public String getCodho() {
        return codho;
    }

    public void setCodho(String codho) {
        this.codho = codho;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getHoini() {
        return hoini;
    }

    public void setHoini(String hoini) {
        this.hoini = hoini;
    }

    public String getHofin() {
        return hofin;
    }

    public void setHofin(String hofin) {
        this.hofin = hofin;
    }

    public String getLun() {
        return lun;
    }

    public void setLun(String lun) {
        this.lun = lun;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getMie() {
        return mie;
    }

    public void setMie(String mie) {
        this.mie = mie;
    }

    public String getJue() {
        return jue;
    }

    public void setJue(String jue) {
        this.jue = jue;
    }

    public String getVie() {
        return vie;
    }

    public void setVie(String vie) {
        this.vie = vie;
    }
    
    
    
}
