package br.com.gpavao.dao;

/**
 * @author rodrigo.pires
 */
public class ClienteDao implements IClienteDao {

    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
        //return "Sucesso";
    }

    @Override
    public String buscar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
    }

    @Override
    public String excluir() {
        throw new UnsupportedOperationException("Erro ao exluir dado");
    }

    @Override
    public String atualizar() {
       throw new UnsupportedOperationException("Erro ao atualizar dado");
    }
}
