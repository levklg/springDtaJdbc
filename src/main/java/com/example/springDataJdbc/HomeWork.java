package com.example.springDataJdbc;

import com.example.springDataJdbc.crm.model.Client;
import com.example.springDataJdbc.crm.repository.ClientRepository;
import com.example.springDataJdbc.crm.service.DBServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("homeWork")
public class HomeWork {
    private static final Logger log = LoggerFactory.getLogger(HomeWork.class);

    private final ClientRepository clientRepository;

    private final DBServiceClient dbServiceClient;

    public HomeWork(ClientRepository clientRepository, DBServiceClient dbServiceClient) {

        this.clientRepository = clientRepository;
        this.dbServiceClient = dbServiceClient;

    }


    void action() {

/// создаем Client
           dbServiceClient.saveClient(new Client("Igir", "9109100000","ул.Московская"));
           dbServiceClient.saveClient(new Client("Sergey", "9108764567", "ул.Ленина"));
           dbServiceClient.saveClient(new Client("Danil", "9032342313", "ул.Кирова"));

/// получаем все сущности
        log.info(">>> All clients");
        dbServiceClient.findAll().forEach(client -> log.info("client:{}", client));

    }

}
