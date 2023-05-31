package Aeronave;

import Intalacoes.Pista;
import Pessoas.Piloto;
import Pessoas.Tripulacao;

public class Aviao extends Aeronave {

    private Piloto piloto;
    private Piloto coPiloto;
    private Pista pouso;
    private Pista decolagem;

    public Aviao(Tripulacao tripulacao, double capacidadeCombustivel, Motor motor, boolean emManutencao, String modelo,
            boolean isAsaFixa, Piloto piloto, Piloto coPiloto, Pista pouso, Pista decolagem) {
        super(tripulacao, capacidadeCombustivel, motor, emManutencao, modelo, isAsaFixa);
        this.piloto = piloto;
        this.coPiloto = coPiloto;
        this.pouso = pouso;
        this.decolagem = decolagem;
    }

    public Piloto isCoPiloto() {
        return coPiloto;
    }

    public void setCoPiloto(Piloto coPiloto) {
        this.coPiloto = coPiloto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Pista getPouso() {
        return pouso;
    }

    public void setPouso(Pista pouso) {
        this.pouso = pouso;
    }

    public Pista getDecolagem() {
        return decolagem;
    }

    public void setDecolagem(Pista decolagem) {
        this.decolagem = decolagem;
    }
}