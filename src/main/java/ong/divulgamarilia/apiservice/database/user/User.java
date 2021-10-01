package ong.divulgamarilia.apiservice.database.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ong.divulgamarilia.apiservice.database.eventos.Eventos;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id_user;

    String nome;

    String endereco;

    String empresa;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "login_id", referencedColumnName = "id_login")
    Login login;

    @OneToMany
    private Set<Eventos> publicacoes;
}
