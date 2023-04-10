// Na torre de controle, deve existir ao menos um controlador, sendo que em aeroportos maiores e mais
// movimentados, o número pode ser muito maior.

// O sistema solicita que o objeto Vôo informe os dados necessários


public class TorreDeControle {
    private Radar radar;
    private Controlador[] controladores;
    private Voo[] listaDeEspera;

    public TorreDeControle(Radar radar, Controlador[] controladores, Voo[] listaDeEspera) {
        this.radar = radar;
        this.controladores = controladores;
        this.listaDeEspera = listaDeEspera;
    }

    public Radar getRadar() {
        return radar;
    }

    public void setRadar(Radar radar) {
        this.radar = radar;
    }

    public Controlador[] getControladores() {
        return controladores;
    }

    public void setControladores(Controlador[] controladores) {
        this.controladores = controladores;
    }

    public Voo[] getListaDeEspera() {
        return listaDeEspera;
    }

    public void setListaDeEspera(Voo[] listaDeEspera) {
        this.listaDeEspera = listaDeEspera;
    }

}
