package br.com.gpavao.dao;

import br.com.gpavao.domain.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
class ProdutoDAOTest {
    private ProdutoDAO produtoDAO;

    @BeforeEach
    void setUp() {
        produtoDAO = new ProdutoDAO();
    }

    @Test
    void testSaveAndFindById() {
        Produto produto = new Produto("1", "Produto A", 10.0);
        produtoDAO.save(produto);

        Optional<Produto> found = produtoDAO.findById("1");
        assertTrue(found.isPresent());
        assertEquals("Produto A", found.get().getNome());
    }

    @Test
    void testUpdate() {
        Produto produto = new Produto("1", "Produto A", 10.0);
        produtoDAO.save(produto);

        produto.setNome("Produto B");
        produtoDAO.update(produto);

        Optional<Produto> found = produtoDAO.findById("1");
        assertTrue(found.isPresent());
        assertEquals("Produto B", found.get().getNome());
    }

    @Test
    void testDeleteById() {
        Produto produto = new Produto("1", "Produto A", 10.0);
        produtoDAO.save(produto);

        produtoDAO.deleteById("1");
        Optional<Produto> found = produtoDAO.findById("1");
        assertFalse(found.isPresent());
    }
}
