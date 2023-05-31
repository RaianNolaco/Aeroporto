package Aeronave;

public class Motor {
    private double consumoCombustivelPorKM;

    public void setConsumoCombustivelPorKM(double consumoCombustivelPorKM) {
        this.consumoCombustivelPorKM = consumoCombustivelPorKM;
    }

    public Motor(double consumoCombustivelPorKM) {
        this.consumoCombustivelPorKM = consumoCombustivelPorKM;
    }

    public double getConsumoCombustivelPorKM() {
        return consumoCombustivelPorKM;
    }

}
