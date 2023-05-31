package Intalacoes;

import Aeronave.Voo;

public class Radar {
    private Voo[] voosRastreados;

    public Radar() {
    }

    public Voo[] getVoosRastreados() {
        return voosRastreados;
    }

    public void setVoosRastreados(Voo[] voosRastreados) {
        this.voosRastreados = voosRastreados;
    }

}
