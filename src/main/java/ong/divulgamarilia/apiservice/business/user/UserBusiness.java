package ong.divulgamarilia.apiservice.business.user;

import ong.divulgamarilia.apiservice.database.evento.model.Evento;

import java.util.List;

public interface UserBusiness {
    public boolean deletarUsuario(Long id);

    public boolean editarInformacoes(EditUserBody body);
}
