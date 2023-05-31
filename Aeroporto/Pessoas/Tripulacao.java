package Pessoas;

public class Tripulacao {
    private Piloto piloto;
    private Piloto CoPiloto;
    private Tripulante[] passageiros;

    public Tripulacao(Piloto piloto) {
        this.piloto = piloto;
    }

    public Tripulacao(Piloto piloto, Tripulante[] passageiros) {
        this.piloto = piloto;
        this.passageiros = passageiros;
    }

    public Tripulacao(Piloto piloto, Piloto coPiloto, Tripulante[] passageiros) {
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

    public Tripulante[] getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Tripulante[] passageiros) {
        this.passageiros = passageiros;
    }

}
