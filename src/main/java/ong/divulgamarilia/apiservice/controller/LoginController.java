package ong.divulgamarilia.apiservice.controller;

import lombok.AllArgsConstructor;
import ong.divulgamarilia.apiservice.business.login.LoginBusinessImpl;
import ong.divulgamarilia.apiservice.business.login.RegisterBody;
import ong.divulgamarilia.apiservice.database.user.Login;
import ong.divulgamarilia.apiservice.database.user.LoginRepository;
import ong.divulgamarilia.apiservice.database.user.User;
import ong.divulgamarilia.apiservice.ops.V1APIController;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@V1APIController
public class LoginController {

    LoginBusinessImpl business;

    @PostMapping("/login")
    public boolean login(@RequestBody Login login) {
        return business.auth(login);
    }

    @PostMapping("/register")
    public Long register(@RequestBody RegisterBody registerBody) {
        return business.register(registerBody);
    }
}
