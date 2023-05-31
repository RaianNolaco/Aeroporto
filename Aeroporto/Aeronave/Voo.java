package Aeronave;

import Aeroporto.Aeroporto;
import Pessoas.Tripulacao;

public class Voo {
    private int id;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;
    private Tripulacao tripulacao;

    public Voo(int id, Aeroporto origem, Aeroporto destino, Aeronave aeronave, Tripulacao tripulacao) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
        this.tripulacao = tripulacao;
    }

    public String buscarInfoAeronave() {
        return aeronave.infoAeronave();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Tripulacao getTripulacao() {
        return tripulacao;
    }

    public void setTripulacao(Tripulacao tripulacao) {
        this.tripulacao = tripulacao;
    }
}
