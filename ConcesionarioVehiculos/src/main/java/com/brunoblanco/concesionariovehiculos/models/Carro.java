package com.brunoblanco.concesionariovehiculos.models;

public class Carro extends Vehiculo {
    private int bolsaAire;
    private int numeroPuertas;

    public Carro(String color, String modelo, int kilometraje) {
        super(modelo, kilometraje);
    }


    public int getBolsaAire() {
        return bolsaAire;
    }

    public void setBolsaAire(int bolsaAire) {
        this.bolsaAire = bolsaAire;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "bolsaAire=" + bolsaAire +
                ", numeroPuertas=" + numeroPuertas +
                '}';
    }
}
