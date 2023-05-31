package Aeronave;

public class Helicoptero extends Aeronave {

    private boolean rotoresGirando;
    private boolean decolagem;
    private boolean coPiloto;

    public Helicoptero() {
        rotoresGirando = false;
        decolagem = true;
        coPiloto = false;
    }

    public boolean isRotoresGirando() {
        return rotoresGirando;
    }

    public void setRotoresGirando(boolean rotoresGirando) {
        this.rotoresGirando = rotoresGirando;
    }

    public boolean isDecolagem() {
        return decolagem;
    }

    public void setDecolagem(boolean decolagem) {
        this.decolagem = decolagem;
    }

    public boolean isCoPiloto() {
        return coPiloto;
    }

    public void setCoPiloto(boolean coPiloto) {
        this.coPiloto = coPiloto;
    }
}