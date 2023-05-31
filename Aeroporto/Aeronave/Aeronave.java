package Aeronave;

import java.util.Date;
import Pessoas.Mecanico;
import Pessoas.Tripulacao;

public abstract class Aeronave {

    private Tripulacao tripulacao;
    private double capacidadeCombustivel;
    private Motor motor;
    private boolean emManutencao;
    private String modelo;
    private boolean isAsaFixa;
    private String cor;
    private Mecanico ultimoMecanicoResponsavel;
    private int capacidadePassageiros;

    public Aeronave(Tripulacao tripulacao, double capacidadeCombustivel, Motor motor, boolean emManutencao,
            String modelo, boolean isAsaFixa, String cor, Mecanico ultimoMecanicoResponsavel) {
        this.tripulacao = tripulacao;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.motor = motor;
        this.emManutencao = emManutencao;
        this.modelo = modelo;
        this.isAsaFixa = isAsaFixa;
        this.cor = cor;
        this.ultimoMecanicoResponsavel = ultimoMecanicoResponsavel;
    }

    public boolean isAsaFixa() {
        return isAsaFixa;
    }

    public void setAsaFixa(boolean isAsaFixa) {
        this.isAsaFixa = isAsaFixa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

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

    public String infoAeronave() {

        return null;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Mecanico getUltimoMecanicoResponsavel() {
        return ultimoMecanicoResponsavel;
    }

    public void setUltimoMecanicoResponsavel(Mecanico ultimoMecanicoResponsavel) {
        this.ultimoMecanicoResponsavel = ultimoMecanicoResponsavel;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String dadosDaAeronave() {
        return "AERONAVE:\nCor: " + getCor() +
                "Modelo: " + getModelo() +
                "Assa fixa: :" + (isAsaFixa() ? "sim" : "Não") +
                "Capacidade de combustivel: " + getCapacidadeCombustivel() +
                "Capacidade de passageiros: " + getCapacidadePassageiros() +
                "Id ultimo mecado responsavel: " + getUltimoMecanicoResponsavel().getId() +
                "Ultimo mecanico responavel: " + getUltimoMecanicoResponsavel().getNome() +
                "MOTOR: " + motor.toString();

    }

}
