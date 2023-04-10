// Os pilotos podem solicitar à torre de controle, através de seus controladores, os procedimentos de Pouso ou
// de decolagem.
// • Em ambos os casos, os vôos podem ser colocados em listas de espera.

// Em caso de pouso, o piloto entra em contato com o controlador e solicita os procedimentos necessários.


public class Piloto {
    private int id;
    private String nome;

    public Piloto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
