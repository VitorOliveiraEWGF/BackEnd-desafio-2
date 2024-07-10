package com.example.repository.votos;
import com.example.entidades.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public class VotosRepository {

    @Repository
    public interface RepositorioVoto extends JpaRepository<Voto, Long> {

    }
}
