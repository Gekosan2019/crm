package ru.shundalov.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.shundalov.crm.dao.GuestRegistrationDao;
import ru.shundalov.crm.dao.RegistrationServiceDao;
import ru.shundalov.crm.model.GuestRegistration;
import ru.shundalov.crm.model.RegistrationService;

import java.util.Iterator;

@Controller
public class RestController {

    @Autowired
    private RegistrationServiceDao emplPositionsDao;


    @GetMapping("/test")
    public String allGuest(){
        Iterator<RegistrationService> iterator = emplPositionsDao.findAll().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        return "test.html";
    }
}
