package br.com.gpavao.dao;

import br.com.gpavao.domain.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProdutoDAO implements GenericDAO<Produto, String> {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void save(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public Optional<Produto> findById(String s) {
        return produtos.stream().filter(produto -> produto.getId().equals(s)).findFirst();
    }

    @Override
    public List<Produto> findAll() {
        return new ArrayList<>(produtos);
    }

    @Override
    public void update(Produto produto) {
        deleteById(produto.getId());
        save(produto);
    }

    @Override
    public void deleteById(String id) {
        produtos = produtos.stream().filter(i -> !i.getId().equals(id)).collect(Collectors.toList());
    }
}
