package com.example.repository.pautas;
import com.example.entidades.pautas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public class PautaRepository {

    @Repository
    public  interface RepositoryPauta extends JpaRepository<pautas, Long> {

    }
}
