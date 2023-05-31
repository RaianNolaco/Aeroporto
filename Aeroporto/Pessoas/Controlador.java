package Pessoas;

import Instalacoes.TorreDeControle;

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

    public void buscarAeroportosDisponiveis() {
    }

}
