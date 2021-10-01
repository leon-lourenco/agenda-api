package ong.divulgamarilia.apiservice.business.login;

import ong.divulgamarilia.apiservice.database.user.Login;

public interface LoginBusiness {

    public boolean auth(Login login);

    public Long register(RegisterBody registerBody);
}
