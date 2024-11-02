package domain;

public class PessoaFisica extends PessoaType {

    private long cpf;

    public PessoaFisica(long cpf) {
        this.cpf = cpf;
    }
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public void jobModel() {
        System.out.println("Pessoa Fisica é um indivíduo com direitos e deveres pessoais");
    }


}
