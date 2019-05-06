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
public class Camioneta extends Auto{
    private int capCarga;
    private int cantEjes;
    private int cantRodadas;

    public Camioneta(int capCarga, int cantEjes, int cantRodadas, int nroSerie, String marca, int anio, double precio, String placa) {
        super(nroSerie, marca, anio, precio, placa);
        this.capCarga = capCarga;
        this.cantEjes = cantEjes;
        this.cantRodadas = cantRodadas;
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    public int getCantEjes() {
        return cantEjes;
    }

    public void setCantEjes(int cantEjes) {
        this.cantEjes = cantEjes;
    }

    public int getCantRodadas() {
        return cantRodadas;
    }

    public void setCantRodadas(int cantRodadas) {
        this.cantRodadas = cantRodadas;
    }
    
}
