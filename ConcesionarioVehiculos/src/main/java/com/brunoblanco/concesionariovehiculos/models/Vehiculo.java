package com.brunoblanco.concesionariovehiculos.models;
import java.util.ArrayList;
public class Vehiculo {



    private String modelo;
    private int kilometraje;

    public Vehiculo( String modelo, int kilometraje) {
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
