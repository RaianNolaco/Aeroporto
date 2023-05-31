package Instalacoes;

import java.util.ArrayList;

import Aeronave.Voo;

public class Radar {
    private ArrayList<Voo> voosRastreados;

    public Radar() {
    }

    public ArrayList<Voo> getVoosRastreados() {
        return voosRastreados;
    }

    public void setVoosRastreados(ArrayList<Voo> voosRastreados) {
        this.voosRastreados = voosRastreados;
    }

}
