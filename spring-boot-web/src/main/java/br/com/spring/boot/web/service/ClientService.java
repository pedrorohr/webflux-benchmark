package br.com.spring.boot.web.service;

import br.com.spring.boot.web.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {

    @Value("${third.party.service.url}")
    private String thirdPartyUrl;

    @Autowired
    RestTemplate restTemplate;

    public Client getClient(Long id) {
        return restTemplate.getForObject(thirdPartyUrl + id, Client.class);
    }
}
