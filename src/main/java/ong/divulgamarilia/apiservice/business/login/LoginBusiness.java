package ong.divulgamarilia.apiservice.business.login;

import ong.divulgamarilia.apiservice.business.login.beans.LoginBody;
import ong.divulgamarilia.apiservice.business.login.beans.RegisterBody;

public interface LoginBusiness {

    public boolean auth(LoginBody login);

    public Long register(RegisterBody registerBody);
}
