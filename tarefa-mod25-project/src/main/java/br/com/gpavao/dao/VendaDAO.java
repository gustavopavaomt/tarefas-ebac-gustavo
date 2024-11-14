package br.com.gpavao.dao;

import br.com.gpavao.domain.Venda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class VendaDAO implements GenericDAO<Venda, String> {
    private List<Venda> vendas = new ArrayList<>();

    @Override
    public void save(Venda venda) {
        vendas.add(venda);
    }

    @Override
    public Optional<Venda> findById(String id) {
        return vendas.stream().filter(v -> v.getId().equals(id)).findFirst();
    }

    @Override
    public List<Venda> findAll() {
        return new ArrayList<>(vendas);
    }

    @Override
    public void update(Venda venda) {
        deleteById(venda.getId());
        save(venda);
    }

    @Override
    public void deleteById(String id) {
        vendas = vendas.stream().filter(v -> !v.getId().equals(id)).collect(Collectors.toList());
    }
}