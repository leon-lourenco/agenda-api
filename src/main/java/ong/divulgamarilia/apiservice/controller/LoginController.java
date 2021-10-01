package ong.divulgamarilia.apiservice.controller;

import lombok.AllArgsConstructor;
import ong.divulgamarilia.apiservice.business.login.LoginBusinessImpl;
import ong.divulgamarilia.apiservice.business.login.RegisterBody;
import ong.divulgamarilia.apiservice.database.user.Login;
import ong.divulgamarilia.apiservice.database.user.LoginRepository;
import ong.divulgamarilia.apiservice.database.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoginController {

    LoginBusinessImpl business;

    @PostMapping("/login/auth")
    public boolean login(@RequestBody Login login) {
        return business.auth(login);
    }

    @PostMapping("/login/register")
    public Long register(@RequestBody RegisterBody registerBody) {
        return business.register(registerBody);
    }
}
