
public abstract class Aeronave {
    private Tripulacao tripulacao;
    private double capacidadeCombustivel;
    private Motor motor;

    public Tripulacao getTripulacao() {
        return tripulacao;
    }

    public void setTripulacao(Tripulacao tripulacao) {
        this.tripulacao = tripulacao;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
