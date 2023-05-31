package Aeronave;

import Intalacoes.Pista;
import Pessoas.Piloto;
import Pessoas.Tripulacao;

public class Helicoptero extends Aeronave {

    private boolean rotoresGirando;
    private Pista heliporto;
    private Piloto piloto;

    public Helicoptero(Tripulacao tripulacao, double capacidadeCombustivel, Motor motor, boolean emManutencao,
            String modelo, boolean isAsaFixa, boolean rotoresGirando, Pista heliporto, Piloto piloto, Piloto coPiloto) {
        super(tripulacao, capacidadeCombustivel, motor, emManutencao, modelo, isAsaFixa);
        this.rotoresGirando = rotoresGirando;
        this.heliporto = heliporto;
        this.piloto = piloto;
        this.coPiloto = coPiloto;
    }

    public Helicoptero(Tripulacao tripulacao, double capacidadeCombustivel, Motor motor, boolean emManutencao,
            String modelo, boolean isAsaFixa, boolean rotoresGirando, Pista heliporto, Piloto piloto) {
        super(tripulacao, capacidadeCombustivel, motor, emManutencao, modelo, isAsaFixa);
        this.rotoresGirando = rotoresGirando;
        this.heliporto = heliporto;
        this.piloto = piloto;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    private Piloto coPiloto;

    public boolean isRotoresGirando() {
        return rotoresGirando;
    }

    public void setRotoresGirando(boolean rotoresGirando) {
        this.rotoresGirando = rotoresGirando;
    }

    public Piloto isCoPiloto() {
        return coPiloto;
    }

    public void setCoPiloto(Piloto coPiloto) {
        this.coPiloto = coPiloto;
    }

    public Pista getHeliporto() {
        return heliporto;
    }

    public void setHeliporto(Pista heliporto) {
        this.heliporto = heliporto;
    }

}