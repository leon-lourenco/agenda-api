package ong.divulgamarilia.apiservice.database.evento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EventoRepository extends JpaRepository<Evento, Long> {

}
