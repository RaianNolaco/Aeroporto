package Intalacoes;
// Na torre de controle, deve existir ao menos um controlador, sendo que em aeroportos maiores e mais

import java.util.ArrayList;

import Aeronave.Voo;
import Pessoas.Controlador;

// O sistema solicita que o objeto Vôo informe os dados necessários

public class TorreDeControle {
    private ArrayList<Radar> radares;
    private ArrayList<Controlador> controladores;
    private ArrayList<Voo> listaDeEspera;

    public TorreDeControle(ArrayList<Radar> radares, ArrayList<Controlador> controladores,
            ArrayList<Voo> listaDeEspera) {
        this.radares = radares;
        this.controladores = controladores;
        this.listaDeEspera = listaDeEspera;
    }

    public ArrayList<Radar> getRadar() {
        return radares;
    }

    public void setRadar(ArrayList<Radar> radares) {
        this.radares = radares;
    }

    public ArrayList<Controlador> getControladores() {
        return controladores;
    }

    public void setControladores(ArrayList<Controlador> controladores) {
        this.controladores = controladores;
    }

    public ArrayList<Voo> getListaDeEspera() {
        return listaDeEspera;
    }

    public void setListaDeEspera(ArrayList<Voo> listaDeEspera) {
        this.listaDeEspera = listaDeEspera;
    }

    public String procedimentoPouso() {
        return null;
    }

    public String procedimentoDecolagem() {
        return null;
    }

}
