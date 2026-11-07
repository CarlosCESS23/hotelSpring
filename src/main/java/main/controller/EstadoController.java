package main.controller;

import main.dto.EstadoInputDto;
import main.dto.EstadoOutputDto;
import main.model.Estado;
import main.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;

@RestController
@RequestMapping("/api/estados")
public class EstadoController {
    @Autowired
    private EstadoService service;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EstadoOutputDto> create(@RequestBody EstadoInputDto estadoInputDto){
        EstadoOutputDto novoEstado = service.create(estadoInputDto);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(novoEstado)
                .toUri();

        return ResponseEntity.created(uri).body(novoEstado);
    }


}
