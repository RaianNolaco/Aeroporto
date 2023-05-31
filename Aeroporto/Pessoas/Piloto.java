package Pessoas;
// Os pilotos podem solicitar à torre de controle, através de seus controladores, os procedimentos de Pouso ou

// de decolagem.
// • Em ambos os casos, os vôos podem ser colocados em listas de espera.

// Em caso de pouso, o piloto entra em contato com o controlador e solicita os procedimentos necessários.

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


    public String solicitarPouso(){
        return controladorResponsavel.procedimentoPouso();
    } 

    public String  solicitarDecolagem(){
        return controladorResponsavel.procedimentoDecolagem();
    }
}

