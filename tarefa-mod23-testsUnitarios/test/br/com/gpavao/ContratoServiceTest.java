package br.com.gpavao;

import br.com.gpavao.dao.ContratoDao;
import br.com.gpavao.dao.IContratoDao;
import br.com.gpavao.dao.mocks.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author rodrigo.pires
 */
public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar

    @Test
    public void buscarNoBancoDeDadosTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String result = service.buscar();
        Assert.assertEquals("Sucesso", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoBuscarNoBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoExcluirNoBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test
    public void atualizarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String result = service.atualizar();
        Assert.assertEquals("Sucesso", result);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoAtualizarNoDB(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
