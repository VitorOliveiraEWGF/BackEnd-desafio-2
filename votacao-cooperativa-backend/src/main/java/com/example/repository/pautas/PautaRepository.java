package com.example.repository.pautas;
import com.example.entidades.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public class PautaRepository {

    @Repository
    public  interface RepositoryPauta extends JpaRepository<Pauta, Long> {

    }
}
