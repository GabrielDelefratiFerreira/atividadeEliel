package com.example.atividade.Controller;

import com.example.atividade.Model.ProdutoModel;
import com.example.atividade.Repository.ProdutoRepository;
import com.example.atividade.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produto){
        return produtoService.criarProduto(produto);
    }

    @GetMapping
    public List<ProdutoModel> buscarProduto(){
        return produtoService.findALL();
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
    }
}