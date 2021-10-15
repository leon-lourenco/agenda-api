package ong.divulgamarilia.apiservice.business.user;

import ong.divulgamarilia.apiservice.database.evento.model.Evento;
import ong.divulgamarilia.apiservice.database.evento.repository.EventoRepository;
import ong.divulgamarilia.apiservice.database.user.model.Login;
import ong.divulgamarilia.apiservice.database.user.model.User;
import ong.divulgamarilia.apiservice.database.user.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserBusinessImpl implements UserBusiness {

    UserRepository repository;

    @Override
    public boolean deletarUsuario(Long id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public boolean editarInformacoes(EditUserBody body) {
        Optional<User> byId = repository.findById(body.getId());
        User user = byId.get();
        Login login = user.getLogin();

        if (login.getPassword().equals(body.getPassword())) {
            user.setNome(body.getNome());
            user.setEmpresa(body.getEmpresa());
            user.setEndereco(body.getEndereco());
            login.setEmail(body.getEmail());
            login.setPassword(body.getPassword());
            user.setLogin(login);
            repository.save(user);
            return true;
        }
        return false;
    }
}
