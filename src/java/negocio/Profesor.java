/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author ShuKalx
 */
public class Profesor {

    String IDpro, nbpro, appro, ndni, gen, niv, email, ncel, usupro, passpro;

    public Profesor() {
    }

    public Profesor(String IDpro, String nbpro, String appro, String ndni, String gen, String niv, String email, String ncel, String usupro, String passpro) {
        this.IDpro = IDpro;
        this.nbpro = nbpro;
        this.appro = appro;
        this.ndni = ndni;
        this.gen = gen;
        this.niv = niv;
        this.email = email;
        this.ncel = ncel;
        this.usupro = usupro;
        this.passpro = passpro;
    }

    public String getIDpro() {
        return IDpro;
    }

    public void setIDpro(String IDpro) {
        this.IDpro = IDpro;
    }

    public String getNbpro() {
        return nbpro;
    }

    public void setNbpro(String nbpro) {
        this.nbpro = nbpro;
    }

    public String getAppro() {
        return appro;
    }

    public void setAppro(String appro) {
        this.appro = appro;
    }

    public String getNdni() {
        return ndni;
    }

    public void setNdni(String ndni) {
        this.ndni = ndni;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getNiv() {
        return niv;
    }

    public void setNiv(String niv) {
        this.niv = niv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNcel() {
        return ncel;
    }

    public void setNcel(String ncel) {
        this.ncel = ncel;
    }

    public String getUsupro() {
        return usupro;
    }

    public void setUsupro(String usupro) {
        this.usupro = usupro;
    }

    public String getPasspro() {
        return passpro;
    }

    public void setPasspro(String passpro) {
        this.passpro = passpro;
    }

}
