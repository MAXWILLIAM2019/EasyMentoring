package com.br.easymentoring.EasyMentoring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_aula_gran_video") // Chave estrangeira referenciando a tabela ConteudoAula
    private ConteudoAula conteudoAula;

    @Column(name = "nome_aula_gran_site")
    private String nomeAulaGranSite;

    @Column(name = "titulo_aula_gran_interno")
    private String tituloAulaGranInterno;

    @Column(name = "id_professor")
    private String idProfessor;

    @Column(name = "nome_professor")
    private String nomeProfessor;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdConteudoAula() {
        // Retorna o ID do curso associado a esta disciplina
        return this.conteudoAula != null ? this.conteudoAula.getId() : null;
    }

	public void setIdConteudoAula(Long idConteudoAula) {
		// Aqui você pode criar um novo objeto Curso e definir apenas o ID
		this.conteudoAula = new ConteudoAula();
		this.conteudoAula.setId(idConteudoAula);
	}

    public String getNomeAulaGranSite() {
        return nomeAulaGranSite;
    }

    public void setNomeAulaGranSite(String nomeAulaGranSite) {
        this.nomeAulaGranSite = nomeAulaGranSite;
    }

    public String getTituloAulaGranInterno() {
        return tituloAulaGranInterno;
    }

    public void setTituloAulaGranInterno(String tituloAulaGranInterno) {
        this.tituloAulaGranInterno = tituloAulaGranInterno;
    }

    public String getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(String idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
}