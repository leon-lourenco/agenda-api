package ong.divulgamarilia.apiservice.business.eventos;

import ong.divulgamarilia.apiservice.database.evento.Evento;

import java.util.List;

public interface EventoBusiness {

    boolean cadastra(CadastroBody body);

    boolean editaEvento();

    boolean apagaEvento();

    Evento listaUmEvento();

    List<Evento> listaEventos();
}
