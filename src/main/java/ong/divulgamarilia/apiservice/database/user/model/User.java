package ong.divulgamarilia.apiservice.database.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ong.divulgamarilia.apiservice.database.evento.model.Evento;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String endereco;

    private String empresa;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Login login;

    @OneToMany(mappedBy = "originalPoster", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Evento> eventos;
}
