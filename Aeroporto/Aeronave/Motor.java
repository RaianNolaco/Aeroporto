package Aeronave;

public class Motor {
    private String modelo;
    private String numeroDeSerie;
    private double consumoCombustivelPorKM;

    public Motor(String modelo, String numeroDeSerie, double consumoCombustivelPorKM) {
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
        this.consumoCombustivelPorKM = consumoCombustivelPorKM;
    }

    public void setConsumoCombustivelPorKM(double consumoCombustivelPorKM) {
        this.consumoCombustivelPorKM = consumoCombustivelPorKM;
    }

    public Motor(double consumoCombustivelPorKM) {
        this.consumoCombustivelPorKM = consumoCombustivelPorKM;
    }

    public double getConsumoCombustivelPorKM() {
        return consumoCombustivelPorKM;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    @Override
    public String toString() {
        return "Modelo: " + getModelo() +
                "\nNumero de serie: " + getNumeroDeSerie() +
                "\nConsumo por KM: " + getConsumoCombustivelPorKM();
    }
}
