package ong.divulgamarilia.apiservice.business.evento;

import ong.divulgamarilia.apiservice.business.evento.beans.CadastroEventoBody;
import ong.divulgamarilia.apiservice.business.evento.beans.EditaEventoBody;
import ong.divulgamarilia.apiservice.database.evento.model.Evento;
import ong.divulgamarilia.apiservice.database.evento.repository.EventoRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Component
public class EventoBusinessImpl implements EventoBusiness {

    EventoRepository repository;

    @Override
    public boolean cadastraEvento(CadastroEventoBody body) {

        Evento evento = new Evento();
        evento.setDescricaoBreve(body.getDesc_breve());
        evento.setDescricaoLonga(body.getDesc_longa());
        evento.setTipoDeEvento(body.getTipo_evento());
        evento.setDataPublicacao(getCurrentData());

        Evento eventoSalvo = repository.save(evento);
        return eventoSalvo.getId() != null;
    }

    @Override
    public boolean editaEvento(EditaEventoBody body) {
        Optional<Evento> byId = repository.findById(body.getId());

        if (byId.isPresent()) {
            byId.get().setDescricaoLonga(body.getDesc_longa());
            byId.get().setDescricaoBreve(body.getDesc_breve());
            byId.get().setTipoDeEvento(body.getTipo_evento());
            byId.get().setDataModificacao(getCurrentData());
            repository.save(byId.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean apagaEvento(Long id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<Evento> listaEventosPorUsuario(Long id) {
        return repository.findAllByOriginalPoster_Id(id);
    }

    @Override
    public List<Evento> listaEventos() {
        return repository.findAll();
    }

    private String getCurrentData() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}
