package com.br.easymentoring.EasyMentoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.easymentoring.EasyMentoring.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
    // Você pode adicionar métodos de consulta personalizados aqui, se necessário
}
