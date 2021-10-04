package ong.divulgamarilia.apiservice.business.eventos;

import ong.divulgamarilia.apiservice.database.evento.Evento;
import ong.divulgamarilia.apiservice.database.evento.EventoRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class EventoBusinessImpl implements EventoBusiness {

    EventoRepository repository;

    @Override
    public boolean cadastra(CadastroBody cadastroBody) {

        Evento evento = new Evento();
        evento.setDescricaoBreve(cadastroBody.getDesc_breve());
        evento.setDescricaoLonga(cadastroBody.getDesc_longa());
        evento.setTipoDeEvento(cadastroBody.getTipo_evento());
        evento.setDataPublicacao(getCurrentData());

        Evento eventoSalvo = repository.save(evento);
        return eventoSalvo.getId_evento() != null;
    }

    @Override
    public boolean editaEvento() {
        return false;
    }

    @Override
    public boolean apagaEvento() {
        return false;
    }

    @Override
    public Evento listaUmEvento() {
        return null;
    }

    @Override
    public List<Evento> listaEventos() {
        return null;
    }

    private String getCurrentData() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}
