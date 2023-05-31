package Pessoas;

import Aeronave.Voo;

public class Tripulante extends Pessoa {

    private Voo voo;

    public Tripulante(int id, String nome, Voo voo) {
        super(id, nome);
        this.voo = voo;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

}
