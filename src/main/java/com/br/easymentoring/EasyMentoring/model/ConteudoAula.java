package com.br.easymentoring.EasyMentoring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ConteudoAula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_conteudo_gran")
    private Integer idConteudoGran;

    @ManyToOne
    @JoinColumn(name = "id_disciplina") // Chave estrangeira referenciando a tabela DisciplinaVideo
    private DisciplinaVideo disciplina;

    @Column(name = "descricaoEditalAssuntos", columnDefinition = "TEXT")
    private String descricaoEditalAssuntos;

    @Column(name = "index_aula_ordem")
    private Integer indexAulaOrdem;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdConteudoGran() {
        return idConteudoGran;
    }

    public void setIdConteudoGran(Integer idConteudoGran) {
        this.idConteudoGran = idConteudoGran;
    }

    public Long getIdDisciplina() {
        // Retorna o ID do curso associado a esta disciplina
        return this.disciplina != null ? this.disciplina.getId() : null;
    }

	public void setIdDisciplina(Long idDisciplina) {
		// Aqui você pode criar um novo objeto Curso e definir apenas o ID
		this.disciplina = new DisciplinaVideo();
		this.disciplina.setId(idDisciplina);
	}

    public String getDescricaoEditalAssuntos() {
        return descricaoEditalAssuntos;
    }

    public void setDescricaoEditalAssuntos(String descricaoEditalAssuntos) {
        this.descricaoEditalAssuntos = descricaoEditalAssuntos;
    }

    public Integer getIndexAulaOrdem() {
        return indexAulaOrdem;
    }

    public void setIndexAulaOrdem(Integer indexAulaOrdem) {
        this.indexAulaOrdem = indexAulaOrdem;
    }
}