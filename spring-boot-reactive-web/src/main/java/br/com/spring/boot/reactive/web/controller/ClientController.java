package br.com.spring.boot.reactive.web.controller;

import br.com.spring.boot.reactive.web.model.Client;
import br.com.spring.boot.reactive.web.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/v1/api/clients", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Mono<Client>> getClient(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.getClient(id));
    }
}
