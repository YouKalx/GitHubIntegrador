/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author ShuKalx
 */
public class Tramites {

    String cod, tipo, archi;

    public Tramites() {

    }

    public Tramites(String cod, String tipo, String archi) {
        this.cod = cod;
        this.tipo = tipo;
        this.archi = archi;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getArchi() {
        return archi;
    }

    public void setArchi(String archi) {
        this.archi = archi;
    }

}
