package ru.shundalov.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.shundalov.crm.model.Guest;
import ru.shundalov.crm.service.GuestService;

import java.util.List;

@RestController
public class GuestRestController {

    @Autowired
    private GuestService guestService;

    @GetMapping("/api/guests")
    public List<Guest> allGuest(){
        return guestService.findAllGuests();
    }
}