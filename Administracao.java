public class Administracao {
    private Voo[] listaDeVoos;
    private Aeronave aeronavesNoChao;
    private Aeronave aeronavesEmVoo;

    public Administracao(Voo[] listaDeVoos, Aeronave aeronavesNoChao, Aeronave aeronavesEmVoo) {
        this.listaDeVoos = listaDeVoos;
        this.aeronavesNoChao = aeronavesNoChao;
        this.aeronavesEmVoo = aeronavesEmVoo;
    }

    public Voo[] getListaDeVoos() {
        return listaDeVoos;
    }

    public void setListaDeVoos(Voo[] listaDeVoos) {
        this.listaDeVoos = listaDeVoos;
    }

    public Aeronave getAeronavesNoChao() {
        return aeronavesNoChao;
    }

    public void setAeronavesNoChao(Aeronave aeronavesNoChao) {
        this.aeronavesNoChao = aeronavesNoChao;
    }

    public Aeronave getAeronavesEmVoo() {
        return aeronavesEmVoo;
    }

    public void setAeronavesEmVoo(Aeronave aeronavesEmVoo) {
        this.aeronavesEmVoo = aeronavesEmVoo;
    }

}
