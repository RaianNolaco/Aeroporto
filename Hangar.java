
// Alguns hangares são utilizados para estacionamento e outros para manutenção das aeronaves.

public abstract class Hangar {
    private Aeronave aeronave;

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

}
