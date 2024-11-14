package br.com.gpavao.dao;

import br.com.gpavao.domain.Cliente;
import org.junit.jupiter.api.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ClienteDAOTest {
    private ClienteDAO clienteDAO;

    @BeforeEach
    void setUp() {
        clienteDAO = new ClienteDAO();
    }

    @Test
    void testSaveAndFindById() {
        Cliente cliente = new Cliente("1", "Gustavo", "gustavo@gustavo.com");
        clienteDAO.save(cliente);

        Optional<Cliente> found = clienteDAO.findById("1");
        assertTrue(found.isPresent());
        assertEquals("Gustavo", found.get().getNome());
    }

    @Test
    void testUpdate() {
        Cliente cliente = new Cliente("1", "Gustavo", "gustavo@gustavo.com");
        clienteDAO.save(cliente);

        cliente.setNome("João Silva");
        clienteDAO.update(cliente);

        Optional<Cliente> found = clienteDAO.findById("1");
        assertTrue(found.isPresent());
        assertEquals("João Silva", found.get().getNome());
    }

    @Test
    void testDeleteById() {
        Cliente cliente = new Cliente("1", "Gustavo", "gustavo@gustavo.com");
        clienteDAO.save(cliente);

        clienteDAO.deleteById("1");
        Optional<Cliente> found = clienteDAO.findById("1");
        assertFalse(found.isPresent());
    }
}
