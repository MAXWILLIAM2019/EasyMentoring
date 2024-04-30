package com.br.easymentoring.EasyMentoring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DisciplinaVideo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "id_disciplina_gran")
	private String idDisciplinaGran;

	@Column(name = "nome_disciplina")
	private String nomeDisciplina;

	@ManyToOne
	@JoinColumn(name = "id_curso") // Chave estrangeira referenciando a tabela Curso
	private Curso curso;

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdDisciplinaGran() {
		return idDisciplinaGran;
	}

	public void setIdDisciplinaGran(String idDisciplinaGran) {
		this.idDisciplinaGran = idDisciplinaGran;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public Long getIdCurso() {
        // Retorna o ID do curso associado a esta disciplina
        return this.curso != null ? this.curso.getId() : null;
    }

	public void setIdCurso(Long idCurso) {
		// Aqui você pode criar um novo objeto Curso e definir apenas o ID
		this.curso = new Curso();
		this.curso.setId(idCurso);
	}
}