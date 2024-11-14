package br.com.gpavao.service;

import br.com.gpavao.dao.VendaDAO;
import br.com.gpavao.domain.Cliente;
import br.com.gpavao.domain.Produto;
import br.com.gpavao.domain.Venda;
import br.com.gpavao.exception.ClienteNotFoundException;
import org.junit.jupiter.api.*;
import java.util.Collections;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class VendaServiceTest {
    private VendaDAO vendaDAO;
    private VendaService vendaService;

    @BeforeEach
    void setUp() {
        vendaDAO = mock(VendaDAO.class);
        vendaService = new VendaService(vendaDAO);
    }

    @Test
    void testCadastrarVenda() {
        Cliente cliente = new Cliente("1", "João", "joao@example.com");
        Produto produto = new Produto("1", "Produto A", 10.0);
        Venda venda = new Venda("1", cliente, Collections.singletonList(produto));

        vendaService.cadastrarVenda(venda);
        verify(vendaDAO, times(1)).save(venda);
    }

    @Test
    void testBuscarVendaPorId() {
        Cliente cliente = new Cliente("1", "João", "joao@example.com");
        Produto produto = new Produto("1", "Produto A", 10.0);
        Venda venda = new Venda("1", cliente, Collections.singletonList(produto));

        when(vendaDAO.findById("1")).thenReturn(Optional.of(venda));

        Venda found = vendaService.buscarVendaPorId("1");
        assertEquals("1", found.getId());
    }

    @Test
    void testBuscarVendaPorIdNotFound() {
        when(vendaDAO.findById("1")).thenReturn(Optional.empty());

        assertThrows(ClienteNotFoundException.class, () -> vendaService.buscarVendaPorId("1"));
    }

    @Test
    void testAtualizarVenda() {
        Cliente cliente = new Cliente("1", "João", "joao@example.com");
        Produto produto = new Produto("1", "Produto A", 10.0);
        Venda venda = new Venda("1", cliente, Collections.singletonList(produto));

        when(vendaDAO.findById("1")).thenReturn(Optional.of(venda));

        venda.setProdutos(Collections.emptyList());
        vendaService.atualizarVenda(venda);
        verify(vendaDAO, times(1)).update(venda);
    }

    @Test
    void testRemoverVenda() {
        Cliente cliente = new Cliente("1", "João", "joao@example.com");
        Produto produto = new Produto("1", "Produto A", 10.0);
        Venda venda = new Venda("1", cliente, Collections.singletonList(produto));

        when(vendaDAO.findById("1")).thenReturn(Optional.of(venda));

        vendaService.removerVenda("1");
        verify(vendaDAO, times(1)).deleteById("1");
    }
}