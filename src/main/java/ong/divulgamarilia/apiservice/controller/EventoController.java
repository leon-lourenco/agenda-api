package ong.divulgamarilia.apiservice.controller;

import ong.divulgamarilia.apiservice.business.evento.beans.CadastroEventoBody;
import ong.divulgamarilia.apiservice.business.evento.EventoBusinessImpl;
import ong.divulgamarilia.apiservice.business.evento.beans.EditaEventoBody;
import ong.divulgamarilia.apiservice.database.evento.model.Evento;
import ong.divulgamarilia.apiservice.ops.V1APIController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@V1APIController
public class EventoController {

    EventoBusinessImpl eventoBusiness;

    @PostMapping("/evento/cadastro")
    public boolean cadastra(@RequestBody CadastroEventoBody body) {
        return eventoBusiness.cadastraEvento(body);
    }

    @PutMapping("/evento/editar")
    public boolean edita(@RequestBody EditaEventoBody body){
        return eventoBusiness.editaEvento(body);
    }

    @DeleteMapping("/evento/deletar/{id}")
    public boolean deleta(@PathVariable Long id){
        return eventoBusiness.apagaEvento(id);
    }

    @GetMapping("/evento/listar/{id}")
    public List<Evento> listaEventosPorUsuario(@PathVariable Long id){
        return eventoBusiness.listaEventosPorUsuario(id);
    }
    @GetMapping("/evento/listar")
    public List<Evento> listaEventos(){
        return eventoBusiness.listaEventos();
    }

}
