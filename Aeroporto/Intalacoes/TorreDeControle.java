package Intalacoes;
// Na torre de controle, deve existir ao menos um controlador, sendo que em aeroportos maiores e mais

import Aeronave.Voo;
import Pessoas.Controlador;

// O sistema solicita que o objeto Vôo informe os dados necessários

public class TorreDeControle {
    private Radar[] radares;
    private Controlador[] controladores;
    private Voo[] listaDeEspera;

    public TorreDeControle(Radar[] radares, Controlador[] controladores, Voo[] listaDeEspera) {
        this.radares = radares;
        this.controladores = controladores;
        this.listaDeEspera = listaDeEspera;
    }

    public Radar[] getRadar() {
        return radares;
    }

    public void setRadar(Radar[] radares) {
        this.radares = radares;
    }

    public Controlador[] getControladores() {
        return controladores;
    }

    public void setControladores(Controlador[] controladores) {
        this.controladores = controladores;
    }

    public Voo[] getListaDeEspera() {
        return listaDeEspera;
    }

    public void setListaDeEspera(Voo[] listaDeEspera) {
        this.listaDeEspera = listaDeEspera;
    }

}
