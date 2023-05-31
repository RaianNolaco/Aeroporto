package Instalacoes;

public class Pista {
    private int id;
    private boolean livre;

    public Pista(int id, boolean livre) {
        this.id = id;
        this.livre = livre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean estaLivre() {
        return livre;
    }

    public void mudarEstado() {

        if (this.livre) {
            this.livre = false;
        } else {
            this.livre = true;
        }
    }
}
