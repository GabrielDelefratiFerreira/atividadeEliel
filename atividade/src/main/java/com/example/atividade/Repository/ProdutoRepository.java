package com.example.atividade.Repository;

import com.example.atividade.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
}