package br.com.gpavao.service;


import br.com.gpavao.dao.VendaDAO;
import br.com.gpavao.domain.Venda;
import br.com.gpavao.exception.ClienteNotFoundException;

import java.util.List;

public class VendaService {
    private static VendaService instance;
    private final VendaDAO vendaDAO;

    public VendaService(VendaDAO vendaDAO) {
        this.vendaDAO = vendaDAO;
    }



    public void cadastrarVenda(Venda venda) {
        vendaDAO.save(venda);
    }

    public Venda buscarVendaPorId(String id) {
        return vendaDAO.findById(id).orElseThrow(() -> new ClienteNotFoundException("Venda não encontrada"));
    }

    public List<Venda> listarVendas() {
        return vendaDAO.findAll();
    }

    public void atualizarVenda(Venda venda) {
        if (vendaDAO.findById(venda.getId()).isPresent()) {
            vendaDAO.update(venda);
        } else {
            throw new ClienteNotFoundException("Venda não encontrada pelo metodo de atualização");
        }
    }

    public void removerVenda(String id) {
        if (vendaDAO.findById(id).isPresent()) {
            vendaDAO.deleteById(id);
        } else {
            throw new ClienteNotFoundException("Venda não encontrada pelo metodo de remoção");
        }
    }
}
