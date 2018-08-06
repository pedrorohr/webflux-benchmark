package br.com.spring.boot.reactive.web.service;

import br.com.spring.boot.reactive.web.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ClientService {

    @Value("${third.party.service.url}")
    private String thirdPartyUrl;

    @Autowired
    WebClient webClient;

    public Mono<Client> getClient(Long id) {
        return webClient
                .get()
                .uri(thirdPartyUrl + id)
                .exchange()
                .flatMap(clientResponse -> clientResponse.bodyToMono(Client.class));
    }
}