package Instalacoes;

import java.util.ArrayList;
import Aeronave.Voo;
import Pessoas.Controlador;

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

    public void adicionarControlador(Controlador controlador) {
        controladores.add(controlador);
    }

    public void adicionarRadar(Radar radar) {
        radares.add(radar);
    }

    public void adicionarVoo(Voo voo) {
        listaDeEspera.add(voo);
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
