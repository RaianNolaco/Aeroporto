
public class Tripulacao {
    private Piloto piloto;
    private Piloto CoPiloto;
    private int passageiros;

    public Tripulacao(Piloto piloto) {
        this.piloto = piloto;
    }

    public Tripulacao(Piloto piloto, int passageiros) {
        this.piloto = piloto;
        this.passageiros = passageiros;
    }

    public Tripulacao(Piloto piloto, Piloto coPiloto, int passageiros) {
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

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

}
