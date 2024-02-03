package ru.shundalov.crm.service;

import ru.shundalov.crm.model.Guest;

import java.util.List;

public interface GuestService {

    Guest saveOrUpdateGuest(Guest guest);

    Guest getGuestById(Long guestId);

    void deleteGuestById(Long guestId);

    List<Guest> findAllGuests();
}