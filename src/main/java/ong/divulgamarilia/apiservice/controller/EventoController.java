package ong.divulgamarilia.apiservice.controller;

import ong.divulgamarilia.apiservice.business.eventos.CadastroBody;
import ong.divulgamarilia.apiservice.business.eventos.EventoBusinessImpl;
import ong.divulgamarilia.apiservice.ops.V1APIController;
import org.springframework.web.bind.annotation.*;

@RestController
@V1APIController
public class EventoController {

    EventoBusinessImpl eventoBusiness;

    @PostMapping("/evento/cadastro")
    public boolean cadastra(@RequestBody CadastroBody body) {
        return eventoBusiness.cadastra(body);
    }
}
