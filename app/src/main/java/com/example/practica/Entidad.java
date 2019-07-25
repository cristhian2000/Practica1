package com.example.practica;

public class Entidad {
    private int nroMaquina;
    private int parqueadero;

    public Entidad(int nroMaquina, int parqueadero) {

        this.nroMaquina = nroMaquina;
        this.parqueadero = parqueadero;
    }

    public int getNroMaquina() {
        return nroMaquina;
    }

    public int getParqueadero() {
        return parqueadero;
    }
}
