package com.example.atividade.Service;

import com.example.atividade.Model.ProdutoModel;
import com.example.atividade.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel criarProduto(ProdutoModel produto){
        return produtoRepository.save(produto);
    }

    public List<ProdutoModel> findALL(){
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> findId(Long id){
        return produtoRepository.findById(id);
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }

    public ProdutoModel atualizar(Long id, ProdutoModel produto){
        ProdutoModel model = produtoRepository.findById(id).get();
        return produtoRepository.save(model);
    }
}