package ong.divulgamarilia.apiservice.business.user;

import ong.divulgamarilia.apiservice.database.eventos.Eventos;

import java.util.List;

public interface UserBusiness {
    public List<Eventos> listarEventosPorUsuario();

    public boolean deletarUsuario();

    public boolean editarInformacoes();
}
