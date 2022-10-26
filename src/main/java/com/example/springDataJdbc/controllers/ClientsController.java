package com.example.springDataJdbc.controllers;


import com.example.springDataJdbc.crm.model.Client;
import com.example.springDataJdbc.crm.service.DbServiceClientImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("getList")
@RequestMapping("/")
public class ClientsController {
    private final DbServiceClientImpl dbServiceClient;

    public ClientsController(DbServiceClientImpl dbServiceClient) {
        this.dbServiceClient = dbServiceClient;
    }

    @GetMapping({"/", "/clients"})
    public String doGet(Model model) {
        Object getList = model.getAttribute("getList");

        List<Client> clientList = new ArrayList<>();
        if (getList != null && getList.equals("getlist")) {
            clientList = dbServiceClient.findAll();
        }
        model.addAttribute("clientList", clientList);
        return "clients";
    }

    @PostMapping({"/", "/clients"})
    public String doPost(@RequestParam(defaultValue = "") String clientName, @RequestParam(defaultValue = "") String clientPhone,
                         @RequestParam(defaultValue = "") String address, @RequestParam(defaultValue = "") String buttonGetList,
                         @RequestParam(defaultValue = "") String buttonCreateClient, Model model) {

        if (buttonCreateClient.equals("create") && !clientName.equals("") && !clientPhone.equals("") && !address.equals("")) {
            dbServiceClient.saveClient(new Client(clientName, clientPhone, address));
        }

        if (buttonGetList.equals("getlist")) {
            model.addAttribute("getList", "getlist");

        }

        return "redirect:/clients";
    }


}
