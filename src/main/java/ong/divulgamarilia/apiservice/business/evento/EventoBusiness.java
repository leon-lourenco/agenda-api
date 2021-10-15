package ong.divulgamarilia.apiservice.business.evento;

import ong.divulgamarilia.apiservice.business.evento.beans.CadastroEventoBody;
import ong.divulgamarilia.apiservice.business.evento.beans.EditaEventoBody;
import ong.divulgamarilia.apiservice.database.evento.model.Evento;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EventoBusiness {

    boolean cadastraEvento(CadastroEventoBody body);

    boolean editaEvento(EditaEventoBody body);

    boolean apagaEvento(Long id);

    List<Evento> listaEventosPorUsuario(Long id);

    List<Evento> listaEventos();


}
