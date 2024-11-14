package br.com.gpavao.dao;

import br.com.gpavao.domain.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClienteDAO implements GenericDAO<Cliente, String> {

    private List<Cliente> clientes = new ArrayList<Cliente>();

    @Override
    public void save(Cliente entity) {
        clientes.add(entity);
    }

    @Override
    public Optional<Cliente> findById(String id) {
        return clientes.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    @Override
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    @Override
    public void update(Cliente cliente) {
        deleteById(cliente.getId());
        save(cliente);
    }
    @Override
    public void deleteById(String id) {
        clientes = clientes.stream().filter(i -> !i.getId().equals(id)).collect(Collectors.toList());
    }
}
