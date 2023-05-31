package Aeroporto;
// • A administração deve manter o cadastro de vôos e pode também localizar os aviões que estiverem em solo,

import java.util.ArrayList;

// no aeroporto.

import Aeronave.Aeronave;
import Aeronave.Voo;

public class Administracao {
    private ArrayList<Voo> listaDeVoos;
    private ArrayList<Aeronave> aeronavesNoChao;

    public Administracao(ArrayList<Voo> listaDeVoos, ArrayList<Aeronave> aeronavesNoChao) {
        this.listaDeVoos = listaDeVoos;
        this.aeronavesNoChao = aeronavesNoChao;
    }

    public ArrayList<Voo> getListaDeVoos() {
        return listaDeVoos;
    }

    public void setListaDeVoos(ArrayList<Voo> listaDeVoos) {
        this.listaDeVoos = listaDeVoos;
    }

    public ArrayList<Aeronave> getAeronavesNoChao() {
        return aeronavesNoChao;
    }

    public void setAeronavesNoChao(ArrayList<Aeronave> aeronavesNoChao) {
        this.aeronavesNoChao = aeronavesNoChao;
    }

    public void registrarVoo(Voo voo) {
        this.listaDeVoos.add(voo);
    }

    public void registraAeronave(Aeronave aeronave) {
        this.aeronavesNoChao.add(aeronave);

    }

}
