package br.com.gpavao.dao;

/**
 * @author rodrigo.pires
 */
public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public void buscar() { throw new UnsupportedOperationException("Nao funcionou a busca");}

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Nao foi salvo no banco");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Erro ao atualizar dado");
    }
}
