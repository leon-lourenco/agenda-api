package ong.divulgamarilia.apiservice.business.evento.beans;

import lombok.Data;

@Data
public class EditaEventoBody {
    private Long id;
    private String desc_breve;
    private String desc_longa;
    private String tipo_evento;
}
