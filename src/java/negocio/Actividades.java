/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author ShuKalx
 */
public class Actividades {
     String codac, nom, des, dia, hora ;
    
        public  Actividades(){

        }

    public Actividades(String codac, String nom, String des, String dia, String hora) {
        this.codac = codac;
        this.nom = nom;
        this.des = des;
        this.dia = dia;
        this.hora = hora;
    }

    public String getCodac() {
        return codac;
    }

    public void setCodac(String codac) {
        this.codac = codac;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
   
    
    
}
