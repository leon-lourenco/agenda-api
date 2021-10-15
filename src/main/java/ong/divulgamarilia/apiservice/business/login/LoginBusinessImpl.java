package ong.divulgamarilia.apiservice.business.login;

import ong.divulgamarilia.apiservice.business.login.beans.LoginBody;
import ong.divulgamarilia.apiservice.business.login.beans.RegisterBody;
import ong.divulgamarilia.apiservice.database.user.model.Login;
import ong.divulgamarilia.apiservice.database.user.repository.LoginRepository;
import ong.divulgamarilia.apiservice.database.user.model.User;
import ong.divulgamarilia.apiservice.database.user.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class LoginBusinessImpl implements LoginBusiness {

    LoginRepository loginRepository;
    UserRepository userRepository;

    @Override
    public boolean auth(LoginBody login) {
        Login loginByEmail = loginRepository.findLoginByEmail(login.getEmail());
        if (loginByEmail.getEmail().equals(login.getEmail())){
            return loginByEmail.getPassword().equals(login.getPassword());
        }
        return false;
    }

    @Override
    public Long register(RegisterBody registerBody) {
        User user = new User();
        user.setNome(registerBody.getNome());
        user.setEndereco(registerBody.getEndereco());
        user.setEmpresa(registerBody.getEmpresa());

        Login login = new Login();
        login.setEmail(registerBody.getEmail());
        login.setPassword(registerBody.getPassword());

        user.setLogin(login);

        return userRepository.save(user).getId();
    }
}
