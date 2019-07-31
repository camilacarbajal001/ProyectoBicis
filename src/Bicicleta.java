/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Punto Digital
 */
public class Bicicleta {
    String nroDeSerie;
    String modelo;
    int año;
    float precio;

    public Bicicleta(String nroDeSerie, String modelo, int año, float precio) {
        this.nroDeSerie = nroDeSerie;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }

    public void setNroDeSerie(String nroDeSerie) {
        this.nroDeSerie = nroDeSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    

            
}
