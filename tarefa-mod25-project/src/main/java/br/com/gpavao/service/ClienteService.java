package br.com.gpavao.service;

import br.com.gpavao.dao.ClienteDAO;
import br.com.gpavao.domain.Cliente;
import br.com.gpavao.exception.ClienteNotFoundException;

import java.util.List;

public class ClienteService {
    private static ClienteService instance;
    private final ClienteDAO clienteDAO;

    public ClienteService(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    public void cadastroCliente(Cliente cliente) {
        clienteDAO.save(cliente);
    }
    public Cliente buscarClientePorId(String id) {
        return clienteDAO.findById(id).orElseThrow(() -> new ClienteNotFoundException("Cliente não encontrado"));
    }
    public List<Cliente> listarClientes(){
        return clienteDAO.findAll();
    }
    public void atualizarCliente(Cliente cliente) {
        if(clienteDAO.findById(cliente.getId()).isPresent()) {
            clienteDAO.update(cliente);
        }else{
            throw new ClienteNotFoundException("Cliente Não encontrado pelo metodo atualizar");
        }
    }
    public void removerCliente(String id) {
        if(clienteDAO.findById(id).isPresent()) {
            clienteDAO.deleteById(id);
        }else {
            throw new ClienteNotFoundException(" Cliente não encontrado pelo metodo de remoção");
        }
    }
}
