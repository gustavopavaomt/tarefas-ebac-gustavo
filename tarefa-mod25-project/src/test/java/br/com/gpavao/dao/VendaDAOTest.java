package br.com.gpavao.dao;

import br.com.gpavao.domain.Cliente;
import br.com.gpavao.domain.Produto;
import br.com.gpavao.domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class VendaDAOTest {
    private VendaDAO vendaDAO;

    @BeforeEach
    void setUp() {
        vendaDAO = new VendaDAO();
    }

    @Test
    void testSaveAndFindById() {
        Cliente cliente = new Cliente("1", "João", "joao@example.com");
        Produto produto = new Produto("1", "Produto A", 10.0);
        Venda venda = new Venda("1", cliente, Collections.singletonList(produto));
        vendaDAO.save(venda);

        Optional<Venda> found = vendaDAO.findById("1");
        assertTrue(found.isPresent());
        assertEquals("1", found.get().getId());
    }

    @Test
    void testUpdate() {
        Cliente cliente = new Cliente("1", "João", "joao@example.com");
        Produto produto = new Produto("1", "Produto A", 10.0);
        Venda venda = new Venda("1", cliente, Collections.singletonList(produto));
        vendaDAO.save(venda);

        venda.setProdutos(Collections.emptyList());
        vendaDAO.update(venda);

        Optional<Venda> found = vendaDAO.findById("1");
        assertTrue(found.isPresent());
        assertTrue(found.get().getProdutos().isEmpty());
    }

    @Test
    void testDeleteById() {
        Cliente cliente = new Cliente("1", "João", "joao@example.com");
        Produto produto = new Produto("1", "Produto A", 10.0);
        Venda venda = new Venda("1", cliente, Collections.singletonList(produto));
        vendaDAO.save(venda);

        vendaDAO.deleteById("1");
        Optional<Venda> found = vendaDAO.findById("1");
        assertFalse(found.isPresent());
    }
}