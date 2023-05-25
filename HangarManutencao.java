import java.util.Date;

public class HangarManutencao extends Hangar {

    private String mecanico;

    public String getMecanico() {
        return mecanico;
    }

    public void setMecanico(String mecanico) {
        this.mecanico = mecanico;
    }

    public void realizarManutencao(Aeronave aeronave) {
        if (aeronave.isEmManutencao()) {
            System.out.println("A aeronave já está em manutenção.");
            return;
        }

        aeronave.setEmManutencao(true);
        System.out.println("Manutenção realizada com sucesso para a aeronave " + aeronave.getMotor());
    }

    public void agendarManutencao(Aeronave aeronave, Date data) {

        Date dataAtual = new Date();

        if (aeronave.isEmManutencao()) {
            System.out.println("A aeronave já está em manutenção. Não é possível agendar uma nova manutenção.");
            return;
        }

        if (data.before(dataAtual)) {
            System.out.println("A data de agendamento deve ser posterior à data atual.");
            return;
        }

        aeronave.setDataAgendamento(data);
        System.out.println("Manutenção da aeronave agendada para " + data);
    }
}