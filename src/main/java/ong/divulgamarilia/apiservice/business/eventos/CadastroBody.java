package ong.divulgamarilia.apiservice.business.eventos;

import lombok.Data;
/*  desc_breve
    desc_longa
    tipo_evento
 */
@Data
public class CadastroBody {
    private String desc_breve;
    private String desc_longa;
    private String tipo_evento;
}
