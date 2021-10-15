package ong.divulgamarilia.apiservice.controller;

import ong.divulgamarilia.apiservice.business.user.EditUserBody;
import ong.divulgamarilia.apiservice.business.user.UserBusinessImpl;
import ong.divulgamarilia.apiservice.database.evento.model.Evento;
import ong.divulgamarilia.apiservice.ops.V1APIController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@V1APIController
public class UserController {

    UserBusinessImpl business;

    @PutMapping
    public boolean editaDados(EditUserBody body) {
        return business.editarInformacoes(body);
    }

    @DeleteMapping("/user/delete/{id}")
    public boolean deletaUser(@PathVariable Long id) {
        return business.deletarUsuario(id);
    }

}
