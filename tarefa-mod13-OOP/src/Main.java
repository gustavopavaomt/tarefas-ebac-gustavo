import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.PessoaType;

public class Main {
    public static void main(String[] args) {

        PessoaType clt = new PessoaFisica(1);
        clt.setIdade(24);
        clt.setNome("Gustavo");
        System.out.println(clt);
        clt.jobModel();
        clt.comumFunctions();
        System.out.println("---------------------------------");

        PessoaType mei = new PessoaJuridica(2);
        mei.setIdade(30);
        mei.setNome("Carlos");
        System.out.println(mei);
        mei.jobModel();
        mei.comumFunctions();
    }
}