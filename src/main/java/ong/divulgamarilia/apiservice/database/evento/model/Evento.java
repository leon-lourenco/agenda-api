package ong.divulgamarilia.apiservice.database.evento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ong.divulgamarilia.apiservice.database.user.model.User;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String descricaoBreve;

    String descricaoLonga;

    String tipoDeEvento;

    String dataPublicacao;

    String dataModificacao;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    User originalPoster;
}
