package com.example.entidades;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pautas")

public class pautas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String descricao;

    @Column(name = "data_abertura", nullable = false)
    private LocalDate dataAbertura;

    @Column(name = "duracao_votacao")
    private Integer duracaoVotacao;

    @OneToMany(mappedBy = "pauta", cascade = CascadeType.ALL) // Define relacionamento um-para-muitos com Votos
    private List<votos> votos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Integer getDuracaoVotacao() {
        return duracaoVotacao;
    }

    public void setDuracaoVotacao(Integer duracaoVotacao) {
        this.duracaoVotacao = duracaoVotacao;
    }

    public List<com.example.entidades.votos> getVotos() {
        return votos;
    }

    public void setVotos(List<com.example.entidades.votos> votos) {
        this.votos = votos;
    }
}
