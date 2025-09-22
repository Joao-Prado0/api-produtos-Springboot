package com.exemplo.app.service;


import com.exemplo.app.controller.ProdutoController;
import com.exemplo.app.model.Produto;
import com.exemplo.app.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProdutoService {

    @Autowired
    private final ProdutoRepository produtoRepository;

    // GET
    public List<Produto> listarTodosProdutos(){
        return (List<Produto>) produtoRepository.findAll();
    }

    public Optional<Produto> buscarProdutoPorID (long id){
        return produtoRepository.findById(id);
    }

    // PUT
    public Produto salvarProduto (Produto produto){
        return produtoRepository.save(produto);
    }


    // DELETE
    public void excluirProduto (long id) {
        produtoRepository.deleteById(id);
    }

    // PUT
    public Produto atualizarProduto(long id, Produto produtoAtualizado){

        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        String.format("Produto não encontrado com ID: %d", id)
                ));

        produto.setNome(produtoAtualizado.getNome());
        produto.setQuantidade(produtoAtualizado.getQuantidade());
        produto.setPreco(produtoAtualizado.getPreco());

        return produtoRepository.save(produto);
    }
}
