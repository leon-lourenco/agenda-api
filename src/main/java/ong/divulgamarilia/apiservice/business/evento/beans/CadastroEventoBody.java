package ong.divulgamarilia.apiservice.business.evento.beans;

import lombok.Data;
/*  desc_breve
    desc_longa
    tipo_evento
 */
@Data
public class CadastroEventoBody {
    private String desc_breve;
    private String desc_longa;
    private String tipo_evento;
}
