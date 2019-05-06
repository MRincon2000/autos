/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autos;

/**
 *
 * @author Estudiante
 */
public class AutoLujo extends Auto{
    private int npasajeros;

    public AutoLujo(int npasajeros, int nroSerie, String marca, int anio, double precio, String placa) {
        super(nroSerie, marca, anio, precio, placa);
        this.npasajeros = npasajeros;
    }

    public int getNpasajeros() {
        return npasajeros;
    }

    public void setNpasajeros(int npasajeros) {
        this.npasajeros = npasajeros;
    }
    
}
