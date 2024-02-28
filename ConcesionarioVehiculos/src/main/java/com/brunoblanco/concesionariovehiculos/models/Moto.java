package com.brunoblanco.concesionariovehiculos.models;

public class Moto extends Vehiculo{

    private String proposito;


    public Moto(String color, String modelo, int kilometraje) {
        super(modelo, kilometraje);
    }


    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "proposito='" + proposito + '\'' +
                '}';
    }
}
