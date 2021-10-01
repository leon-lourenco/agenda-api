package ong.divulgamarilia.apiservice.business.login;

import lombok.Data;

@Data
public class RegisterBody {

    private String nome;
    private String endereco;
    private String email;
    private String password;
    private String empresa;

}
