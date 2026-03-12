package com.example.atividade.Service;

import com.example.atividade.Model.ProdutoModel;
import com.example.atividade.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

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

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }
}