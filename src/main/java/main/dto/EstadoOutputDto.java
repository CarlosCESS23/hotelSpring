package main.dto;

import lombok.Getter;
import lombok.Setter;
import main.model.Estado;

@Getter
@Setter
public class EstadoOutputDto {
    private Long id;
    private String nome;
    private String ibge;
    private String sigla;

    public EstadoOutputDto(Estado estado){
        setId(estado.getEstid());
        setIbge(estado.getEstibge());
        setNome(estado.getEstnome());
        setSigla(estado.getEstsigla());
    }
}
