package br.devgustavo.curso;

public class Cachorro {
    //Este Comentario foi a pedido do professor para ser gerado
    //Aqui temos um exemplo de um object do tipo cachorro

    private String cor;
    private String nome;
    private String raca;
    private String sexo;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    //aqui temos um metodo que faz uma acao de latido simulado

    public void acaoLatir(){
        System.out.println("O cachorro está latindo");
    }

    //aqui temos um metodo que altera o nome do cachorro
    public void alterarName(String name){
        this.setNome(name);
    }
}
