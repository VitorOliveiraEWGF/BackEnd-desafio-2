package com.example.entidades;

import javax.persistence.*;

@Entity
@Table(name = "votos")

public class votos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pauta_id", nullable = false)
    private pautas pauta;

    @Column(name = "associado_id", nullable = false)
    private Long associadoId;

    @Column(nullable = false, length = 3)
    private String voto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public pautas getPauta() {
        return pauta;
    }

    public void setPauta(pautas pauta) {
        this.pauta = pauta;
    }

    public Long getAssociadoId() {
        return associadoId;
    }

    public void setAssociadoId(Long associadoId) {
        this.associadoId = associadoId;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }
}

