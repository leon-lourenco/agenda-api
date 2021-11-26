package ong.divulgamarilia.apiservice.controller;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import ong.divulgamarilia.apiservice.business.login.LoginBusinessImpl;
import ong.divulgamarilia.apiservice.business.login.beans.LoginBody;
import ong.divulgamarilia.apiservice.business.login.beans.RegisterBody;
import ong.divulgamarilia.apiservice.ops.V1APIController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@V1APIController
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Events.")
public class LoginController {

    LoginBusinessImpl business;

    @PostMapping("/login")
    public boolean login(@RequestBody LoginBody login) {
        return business.auth(login);
    }

    @PostMapping("/register")
    public Long register(@RequestBody RegisterBody registerBody) {
        return business.register(registerBody);
    }
}
