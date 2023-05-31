package Intalacoes;

public class HangarEstacionamento extends Hangar {

    private boolean ocupado;

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void mudarEstado() {

        if (this.ocupado) {
            this.ocupado = false;
        } else {
            this.ocupado = true;
        }
    }
}
