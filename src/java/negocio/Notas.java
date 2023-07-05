/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author ShuKalx
 */
public class Notas {
     String IDalu, nbalu, n1,n2,n3,n4,n5,nf, estado ;
    
        public  Notas(){

        }

    public Notas(String IDalu, String nbalu, String n1, String n2, String n3, String n4, String n5, String nf, String estado) {
        this.IDalu = IDalu;
        this.nbalu = nbalu;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.nf = nf;
        this.estado = estado;
    }

    public String getIDalu() {
        return IDalu;
    }

    public void setIDalu(String IDalu) {
        this.IDalu = IDalu;
    }

    public String getNbalu() {
        return nbalu;
    }

    public void setNbalu(String nbalu) {
        this.nbalu = nbalu;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }

    public String getN5() {
        return n5;
    }

    public void setN5(String n5) {
        this.n5 = n5;
    }

    public String getNf() {
        return nf;
    }

    public void setNf(String nf) {
        this.nf = nf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
  
}
