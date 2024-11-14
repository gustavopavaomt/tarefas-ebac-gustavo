package br.com.gpavao.service;

import br.com.gpavao.dao.ClienteDAO;
import br.com.gpavao.domain.Cliente;
import br.com.gpavao.exception.ClienteNotFoundException;
import org.junit.jupiter.api.*;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ClienteServiceTest {
    private ClienteDAO clienteDAO;
    private ClienteService clienteService;

    @BeforeEach
    void setUp() {
        clienteDAO = mock(ClienteDAO.class);
        clienteService = new ClienteService(clienteDAO);
    }

    @Test
    void testCadastrarCliente() {
        Cliente cliente = new Cliente("1","Gustavo","gustavo@gustavo.com.br");
        clienteService.cadastroCliente(cliente);
        verify(clienteDAO, times(1)).save(cliente);
    }
    @Test
    void testBuscarClientePorId(){
        Cliente cliente = new Cliente("1","Gustavo","gustavo@gustavo.com.br");
        when(clienteDAO.findById("1")).thenReturn(Optional.of(cliente));
        Cliente found = clienteService.buscarClientePorId("1");
        assertEquals("Gustavo", found.getNome());
    }
    @Test
    void esperadoErroAoBuscarClienteNotFound(){
        when(clienteDAO.findById("1")).thenReturn(Optional.empty());
        assertThrows(ClienteNotFoundException.class, () -> clienteService.buscarClientePorId("1"));
    }

    @Test
    void testAtualizarCliente() {
        Cliente cliente = new Cliente("1","Gustavo","gustavo@gustavo.com.br");
        when(clienteDAO.findById("1")).thenReturn(Optional.of(cliente));
        cliente.setNome("Joao");
        clienteService.atualizarCliente(cliente);
        verify(clienteDAO, times(1)).update(cliente);
    }
    @Test
    void testRemoverCliente() {
        Cliente cliente = new Cliente("1","Gustavo","gustavo@gustavo.com.br");
        when(clienteDAO.findById("1")).thenReturn(Optional.of(cliente));
        clienteService.removerCliente("1");
        verify(clienteDAO, times(1)).deleteById("1");
    }

}

