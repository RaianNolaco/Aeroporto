
// Desse modo, o objeto Pista necessita informações do Radar para que seja escolhida a pista adequada

// • As informações obtidas são repassadas à interface e o controlador informa ao piloto os procedimentos de
// pouso

public class Pista {
    private boolean livre;

    public Pista() {
    }

    public boolean isLivre() {
        return livre;
    }

    public void setLivre(boolean livre) {
        this.livre = livre;
    }

}
