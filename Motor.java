
public class Motor {
    private double consumoCombustivelPorKM; //L/KM

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
