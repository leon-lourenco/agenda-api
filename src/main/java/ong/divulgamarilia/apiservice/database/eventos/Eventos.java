package ong.divulgamarilia.apiservice.database.eventos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Eventos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id_evento;

    String descricaoBreve;

    String descricaoLonga;

    String tipoDeEvento;

    Date dataPublicacao;

    Date dataModificacao;
}
