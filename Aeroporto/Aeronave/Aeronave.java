package Aeronave;

// As características de cada aparelho são diferentes, como por exemplo:
// – um helicóptero não necessita de pista para pousar ou decolar. Entretanto, também possuem
// características semelhantes, como por exemplo:
// • ambos necessitam de pilotos, utilizam combustível e possuem motor. Dependendo do tipo de
// aeronave, pode haver também a necessidade de um co-piloto.

import java.util.Date;

import Pessoas.Tripulacao;

public class Aeronave {

    private Tripulacao tripulacao;
    private double capacidadeCombustivel;
    private Motor motor;
    private boolean emManutencao;

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

    public double calcularDistanciaPossivel() {
        return this.capacidadeCombustivel / this.motor.getConsumoCombustivelPorKM();
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setDataAgendamento(Date data) {
    }

}
