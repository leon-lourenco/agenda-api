package ong.divulgamarilia.apiservice.business.user;

import ong.divulgamarilia.apiservice.database.evento.Evento;

import java.util.List;

public interface UserBusiness {
    public List<Evento> listarEventosPorUsuario();

    public boolean deletarUsuario();

    public boolean editarInformacoes();
}
