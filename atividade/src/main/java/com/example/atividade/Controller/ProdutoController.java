package com.example.atividade.Controller;

import com.example.atividade.Model.ProdutoModel;
import com.example.atividade.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<ProdutoModel> buscarPeloId(@PathVariable Long id){
        return produtoService.findId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizarProduto(@PathVariable Long id, @RequestBody ProdutoModel produto){
        return produtoService.atualizar(id,produto);
    }
}