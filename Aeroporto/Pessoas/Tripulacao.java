package Pessoas;

import java.util.ArrayList;

public class Tripulacao {
    private Piloto piloto;
    private Piloto CoPiloto;
    private ArrayList<Tripulante> passageiros;

    public Tripulacao(Piloto piloto) {
        this.piloto = piloto;
    }

    public Tripulacao(Piloto piloto, ArrayList<Tripulante> passageiros) {
        this.piloto = piloto;
        this.passageiros = passageiros;
    }

    public Tripulacao(Piloto piloto, Piloto coPiloto, ArrayList<Tripulante> passageiros) {
        this.piloto = piloto;
        CoPiloto = coPiloto;
        this.passageiros = passageiros;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Piloto getCoPiloto() {
        return CoPiloto;
    }

    public void setCoPiloto(Piloto coPiloto) {
        CoPiloto = coPiloto;
    }

    public ArrayList<Tripulante> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(ArrayList<Tripulante> passageiros) {
        this.passageiros = passageiros;
    }

}
