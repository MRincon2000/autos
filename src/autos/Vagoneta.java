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
public class Vagoneta extends Auto{
    private int nPasajeros;

    public Vagoneta(int nPasajeros, int nroSerie, String marca, int anio, double precio, String placa) {
        super(nroSerie, marca, anio, precio, placa);
        this.nPasajeros = nPasajeros;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }
    
}
