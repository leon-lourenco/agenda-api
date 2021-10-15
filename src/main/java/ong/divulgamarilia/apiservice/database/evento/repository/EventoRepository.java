package ong.divulgamarilia.apiservice.database.evento.repository;

import ong.divulgamarilia.apiservice.database.evento.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EventoRepository extends JpaRepository<Evento, Long> {

    List<Evento> findAllByOriginalPoster_Id(Long id);
}
