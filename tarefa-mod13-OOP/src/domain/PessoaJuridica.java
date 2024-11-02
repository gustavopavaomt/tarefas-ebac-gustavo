package domain;

public class PessoaJuridica extends PessoaType {

    private long cnpj;

    public PessoaJuridica(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void jobModel() {
        System.out.println("O Jurídico é uma entidade criada para fins legais, como empresas ou organizações");
    }


}
