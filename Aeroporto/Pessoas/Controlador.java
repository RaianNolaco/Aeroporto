package Pessoas;
// O controlador solicita ao sistema que informe os procedimentos de pouso para o vôo cujo número foi

import Intalacoes.TorreDeControle;

// fornecido pelo piloto.

public class Controlador extends Pessoa {

    private TorreDeControle torreDeControle;

    public Controlador(int id, String nome) {
        super(id, nome);
    }

    public TorreDeControle getTorreDeControle() {
        return torreDeControle;
    }

    public void setTorreDeControle(TorreDeControle torreDeControle) {
        this.torreDeControle = torreDeControle;
    }

    public String procedimentoPouso() {
        return torreDeControle.procedimentoPouso();
    }

    public String procedimentoDecolagem() {
        return torreDeControle.procedimentoDecolagem();
    }

    public void enviarParaPiloto(int idPiloto, String procedimento) {
    }

    public void buscarAeroportos() {
    }

}
