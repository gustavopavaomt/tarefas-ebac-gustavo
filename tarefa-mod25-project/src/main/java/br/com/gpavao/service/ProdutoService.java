package br.com.gpavao.service;

import br.com.gpavao.dao.ProdutoDAO;
import br.com.gpavao.domain.Produto;
import br.com.gpavao.exception.ClienteNotFoundException;

import java.util.List;

public class ProdutoService {

    private static ProdutoService instance;
    private final ProdutoDAO produtoDAO;

    public ProdutoService(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }


    public void cadastrarProduto(Produto produto) {
        produtoDAO.save(produto);
    }

    public Produto buscarProdutoPorId(String id) {
        return produtoDAO.findById(id).orElseThrow(() -> new ClienteNotFoundException("Produto não encontrado"));
    }

    public List<Produto> listarProdutos() {
        return produtoDAO.findAll();
    }
    public void atualizarProduto(Produto produto) {
        if(produtoDAO.findById(produto.getId()).isPresent()){
            produtoDAO.update(produto);
        }else {
            throw new ClienteNotFoundException("Produto nao encontrado pelo metodo de atualizar");
        }
    }
    public void removerProduto(String id) {
        if (produtoDAO.findById(id).isPresent()) {
            produtoDAO.deleteById(id);
        } else {
            throw new ClienteNotFoundException("Produto nao encontrado pelo metodo de remover");
        }
    }
}
