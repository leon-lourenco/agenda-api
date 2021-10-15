package ong.divulgamarilia.apiservice.business.user;

import lombok.Data;

@Data
public class EditUserBody {
    private Long id;
    private String nome;
    private String endereco;
    private String email;
    private String password;
    private String empresa;
}
