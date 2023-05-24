// um vôo é sempre entre dois aeroportos(origem e destino)

// Cada vôo possui um número que o identifica.

// Vôos transportam passageiros e todos os vôos são registrados numa base central que pode ser acessada por
// todos os aeroportos.

// Nos pousos, Caso o aeroporto não possua condições para receber o vôo, o controlador pode solicitar uma
// relação de aeroportos abertos e dirigir o vôo para um aeroporto alternativo.

// Faz parte dos atributos do objeto Vôo as informações do tipo de avião. Assim sendo o objeto solicita ao
// objeto Avião as características físicas da aeronave.
// As informações são repassadas à interface que, de posse desses dados, solicita ao objeto Pista as
// informações sobre a pista adequada ao tipo de aeronave.

// Ocorre, entretanto, que as condições climáticas e outros fatores físicos podem influenciar no tipo de pista a
// ser utilizada.

public class Voo {
    private int id;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;
    private Tripulacao tripulacao;

    public Voo(int id, Aeroporto origem, Aeroporto destino, Aeronave aeronave, Tripulacao tripulacao) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.aeronave = aeronave;
        this.tripulacao = tripulacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Tripulacao getTripulacao() {
        return tripulacao;
    }

    public void setTripulacao(Tripulacao tripulacao) {
        this.tripulacao = tripulacao;
    }
}
