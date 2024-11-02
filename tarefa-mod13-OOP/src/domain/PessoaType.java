package domain;

public abstract class PessoaType {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //function comum para um clt ou um juridico
    public void comumFunctions(){
        System.out.println("Ambas podem celebrar contratos, possuir bens e ser responsáveis por obrigações legais.");
    }

    //especifica para cada um
    public abstract void jobModel();

    @Override
    public String toString() {
        return "PessoaType{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
