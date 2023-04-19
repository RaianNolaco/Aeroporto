// • A administração deve manter o cadastro de vôos e pode também localizar os aviões que estiverem em solo,
// no aeroporto.


public class Administracao {
    private Voo[] listaDeVoos;
    private Aeronave[] aeronavesNoChao;

    public Administracao(Voo[] listaDeVoos, Aeronave[] aeronavesNoChao) {
        this.listaDeVoos = listaDeVoos;
        this.aeronavesNoChao = aeronavesNoChao;
    }

    public Voo[] getListaDeVoos() {
        return listaDeVoos;
    }

    public void setListaDeVoos(Voo[] listaDeVoos) {
        this.listaDeVoos = listaDeVoos;
    }

    public Aeronave[] getAeronavesNoChao() {
        return aeronavesNoChao;
    }

    public void setAeronavesNoChao(Aeronave[] aeronavesNoChao) {
        this.aeronavesNoChao = aeronavesNoChao;
    }


}
