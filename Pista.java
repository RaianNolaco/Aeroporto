
// Desse modo, o objeto Pista necessita informações do Radar para que seja escolhida a pista adequada

// • As informações obtidas são repassadas à interface e o controlador informa ao piloto os procedimentos de
// pouso

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
        if(this.livre){
            this.livre = false;
        }else{
            this.livre = true;
        }
    }                                     
}
