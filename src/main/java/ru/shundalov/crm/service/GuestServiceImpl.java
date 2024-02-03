package ru.shundalov.crm.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.shundalov.crm.service.dao.GuestDao;
import ru.shundalov.crm.model.Guest;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class GuestServiceImpl implements GuestService {
    private final GuestDao guestDao;

    public GuestServiceImpl(GuestDao guestDao) {
        this.guestDao = guestDao;
    }

    @Override
    public Guest saveOrUpdateGuest(Guest guest) {
        log.info("save/update guest");
        return guestDao.save(guest);
    }

    @Override
    public Guest getGuestById(Long guestId) {
        log.info("get guest by Id");
        return guestDao.findById(guestId).orElse(null);
    }

    @Override
    public void deleteGuestById(Long guestId) {
        log.info("delete guest by Id");
        guestDao.deleteById(guestId);
    }

    @Override
    public List<Guest> findAllGuests() {
        log.info("get all guests");
        List<Guest> guests = new ArrayList<>();
        guestDao.findAll().forEach(guests::add);
        return guests;
    }
}