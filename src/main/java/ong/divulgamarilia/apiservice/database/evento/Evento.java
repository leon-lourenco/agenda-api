package ong.divulgamarilia.apiservice.database.evento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id_evento;

    String descricaoBreve;

    String descricaoLonga;

    String tipoDeEvento;

    String dataPublicacao;

    String dataModificacao;
}
