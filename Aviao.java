public class Aviao extends Aeronave {

    private boolean asaFixa;
    private boolean coPiloto;

    public Aviao() {
        asaFixa = true;
        coPiloto = false;
    }

    public boolean isAsaFixa() {
        return asaFixa;
    }

    public void setAsaFixa(boolean asaFixa) {
        this.asaFixa = asaFixa;
    }

    public boolean isCoPiloto() {
        return coPiloto;
    }

    public void setCoPiloto(boolean CoPiloto) {
        this.coPiloto = coPiloto;
    }
}