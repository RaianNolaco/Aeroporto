// • A administração deve manter o cadastro de vôos e pode também localizar os aviões que estiverem em solo,
// no aeroporto.


public class Administracao {
    private Voo[] listaDeVoos = new Voo[1];
    private Aeronave[] aeronavesNoChao = new Aeronave[1];

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

    public void registrarVoo(Voo voo){
        aumentaCapacidadeListaDeVoo();
        this.listaDeVoos[this.listaDeVoos.length - 1] = voo;
    }

    public void registraAeronave(Aeronave aeronave){
        aumentaCapacidadeAeronavesNoChao();
        this.aeronavesNoChao[this.aeronavesNoChao.length - 1] = aeronave;
    }

    public void aumentaCapacidadeAeronavesNoChao(){
        Aeronave[] temp = new Aeronave[this.aeronavesNoChao.length + 1];
        for(int i = 0; i < this.aeronavesNoChao.length; i++){
            temp[i] = this.aeronavesNoChao[i];
        }
        this.aeronavesNoChao = temp;
    }

    public void aumentaCapacidadeListaDeVoo(){
        Voo[] temp = new Voo[this.listaDeVoos.length + 1];
        for(int i = 0; i < this.listaDeVoos.length; i++){
            temp[i] = this.listaDeVoos[i];
        }
        this.listaDeVoos = temp;
    }



}
