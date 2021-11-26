package ong.divulgamarilia.apiservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import ong.divulgamarilia.apiservice.business.evento.beans.CadastroEventoBody;
import ong.divulgamarilia.apiservice.business.evento.EventoBusinessImpl;
import ong.divulgamarilia.apiservice.business.evento.beans.EditaEventoBody;
import ong.divulgamarilia.apiservice.database.evento.model.Evento;
import ong.divulgamarilia.apiservice.ops.V1APIController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@V1APIController
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Events.")
public class EventoController {

    EventoBusinessImpl eventoBusiness;

    @PostMapping("/evento/cadastro")
    @ApiOperation("Create an user")
    public boolean cadastra(@RequestBody CadastroEventoBody body) {
        return eventoBusiness.cadastraEvento(body);
    }

    @PutMapping("/evento/editar")
    @ApiOperation("Edit an user")
    public boolean edita(@ApiParam("User information to be edited. Cannot be empty.") @RequestBody EditaEventoBody body){
        return eventoBusiness.editaEvento(body);
    }

    @DeleteMapping("/evento/deletar/{id}")
    @ApiOperation("Delete an user")
    public boolean deleta(@ApiParam("Id of the person to be deleted. Cannot be empty.") @PathVariable Long id){
        return eventoBusiness.apagaEvento(id);
    }

    @GetMapping("/evento/listar/{id}")
    @ApiOperation("List events created by a user")
    public List<Evento> listaEventosPorUsuario(@ApiParam("Id of the person which events are to be obtained. Cannot be empty.") @PathVariable Long id){
        return eventoBusiness.listaEventosPorUsuario(id);
    }
    @GetMapping("/evento/listar")
    @ApiOperation("List all events")
    public List<Evento> listaEventos(){
        return eventoBusiness.listaEventos();
    }

}
