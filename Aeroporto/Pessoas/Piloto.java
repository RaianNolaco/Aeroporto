package Pessoas;

public class Piloto extends Pessoa {

    private String registroPiloto;
    private Controlador controladorResponsavel;

    public Piloto(int id, String nome, String registroPiloto, Controlador controladorResponsavel) {
        super(id, nome);
        this.registroPiloto = registroPiloto;
        this.controladorResponsavel = controladorResponsavel;
    }

    public String getRegistroPiloto() {
        return registroPiloto;
    }

    public void setRegistroPiloto(String registroPiloto) {
        this.registroPiloto = registroPiloto;
    }

    public String solicitarPouso() {
        return controladorResponsavel.procedimentoPouso();
    }

    public String solicitarDecolagem() {
        return controladorResponsavel.procedimentoDecolagem();
    }
}
