package br.com.gpavao.service;

import br.com.gpavao.dao.ProdutoDAO;
import br.com.gpavao.domain.Produto;
import br.com.gpavao.exception.ClienteNotFoundException;
import org.junit.jupiter.api.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProdutoServiceTest {
    private ProdutoDAO produtoDAO;
    private ProdutoService produtoService;

    @BeforeEach
    void setUp() {
        produtoDAO = mock(ProdutoDAO.class);
        produtoService = new ProdutoService(produtoDAO);
    }

    @Test
    void testCadastrarProduto() {
        Produto produto = new Produto("1", "Produto A", 10.0);
        produtoService.cadastrarProduto(produto);
        verify(produtoDAO, times(1)).save(produto);
    }

    @Test
    void testBuscarProdutoPorId() {
        Produto produto = new Produto("1", "Produto A", 10.0);
        when(produtoDAO.findById("1")).thenReturn(Optional.of(produto));

        Produto found = produtoService.buscarProdutoPorId("1");
        assertEquals("Produto A", found.getNome());
    }

    @Test
    void testBuscarProdutoPorIdNotFound() {
        when(produtoDAO.findById("1")).thenReturn(Optional.empty());

        assertThrows(ClienteNotFoundException.class, () -> produtoService.buscarProdutoPorId("1"));
    }

    @Test
    void testAtualizarProduto() {
        Produto produto = new Produto("1", "Produto A", 10.0);
        when(produtoDAO.findById("1")).thenReturn(Optional.of(produto));

        produto.setNome("Produto B");
        produtoService.atualizarProduto(produto);
        verify(produtoDAO, times(1)).update(produto);
    }

    @Test
    void testRemoverProduto() {
        Produto produto = new Produto("1", "Produto A", 10.0);
        when(produtoDAO.findById("1")).thenReturn(Optional.of(produto));

        produtoService.removerProduto("1");
        verify(produtoDAO, times(1)).deleteById("1");
    }
}