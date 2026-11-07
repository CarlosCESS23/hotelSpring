package main.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.model.Estado;

@Setter
@Getter
public class EstadoInputDto {
    private String nome;
    private String ibge;
    private String sigla;

    public EstadoInputDto(){

    }

    public Estado build(){
        Estado estado = new Estado();
        estado.setEstnome(getNome());
        estado.setEstibge(getIbge());
        estado.setEstsigla(getSigla());
        return estado;
    }
}
