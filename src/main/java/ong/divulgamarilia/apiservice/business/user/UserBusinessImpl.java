package ong.divulgamarilia.apiservice.business.user;

import ong.divulgamarilia.apiservice.database.evento.Evento;

import java.util.List;

public class UserBusinessImpl implements UserBusiness{

    @Override
    public List<Evento> listarEventosPorUsuario() {
        return null;
    }

    @Override
    public boolean deletarUsuario() {
        return false;
    }

    @Override
    public boolean editarInformacoes() {
        return false;
    }
}
