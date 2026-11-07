package main.service;

import main.dto.EstadoInputDto;
import main.dto.EstadoOutputDto;
import main.model.Estado;
import main.repository.EstadoRepository;
import org.springframework.stereotype.Service;


@Service
public class EstadoService {
    private final EstadoRepository repository;

    public EstadoService(EstadoRepository repository){
        this.repository = repository;
    }

    public EstadoOutputDto create(EstadoInputDto inputDto){
        Estado estado = inputDto.build();
        Estado salvo = repository.save(estado);
        return new EstadoOutputDto(estado);
    }

}
