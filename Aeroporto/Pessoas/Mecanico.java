package Pessoas;

public class Mecanico extends Pessoa {

    private String autorizacao;
    private String especializacao;

    public Mecanico(int id, String nome, String autorizacao, String especializacao) {
        super(id, nome);
        this.autorizacao = autorizacao;
        this.especializacao = especializacao;
    }

    public String getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String autorizacao) {
        this.autorizacao = autorizacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    
}
