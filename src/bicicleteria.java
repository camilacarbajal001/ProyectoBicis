
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Punto Digital
 */
public class bicicleteria {

    ArrayList<Bicicleta> bicicletas;
    float ganancias;
    int cantidaddeventas;

    public bicicleteria() {
        bicicletas = new ArrayList<>();
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }

    public int getCantidaddeventas() {
        return cantidaddeventas;
    }

    public void setCantidaddeventas(int cantidaddeventas) {
        this.cantidaddeventas = cantidaddeventas;
    }

    void addBicicleta(Bicicleta nuevaBici) {
        bicicletas.add(nuevaBici);
    }

    void VenderBicicleta(Bicicleta bicicleta) {
        cantidaddeventas++;
        ganancias = ganancias + bicicleta.getPrecio();
        bicicletas.remove(bicicleta);

    }

    public Bicicleta buscarBicicleta(String nroDeSerie) {
        for (int i = 0; i < bicicletas.size(); i++) {

            if (nroDeSerie.equals(bicicletas.get(i).getNroDeSerie())) {
                return bicicletas.get(i);
            }

        }
     return null;
    }
}


  

