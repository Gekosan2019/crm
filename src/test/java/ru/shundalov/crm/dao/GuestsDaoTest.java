package ru.shundalov.crm.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.shundalov.crm.model.Guests;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class GuestsDaoTest {

    @Autowired
    GuestDao guestDao;

    private final Long NEW_AGE = 100L;

    @Test
    public void checkSaveGuest() {
        Guests guest = Guests.builder()
                .name("Shamil")
                .surname("Shundalov")
                .age(21L)
                .build();

        log.info("1.Save guest");
        guestDao.save(guest);
        log.info("2.Get saved guest");
        Guests savedGuest = guestDao.findById(guest.getGuestId()).orElse(null);

        log.info("3.CHECK");
        assertNotNull("Check get guest is not null", savedGuest);
        assertEquals("Check name", "Shamil", savedGuest.getName());
        assertEquals("Check surname", "Shundalov", savedGuest.getSurname());
        assertEquals("Check age", 21L, savedGuest.getAge());
    }

    @Test
    public void checkUpdateGuest() {
        Guests guest = Guests.builder()
                .name("Azat")
                .surname("Kushkarov")
                .age(21L)
                .build();
        log.info("1.Save guest");
        guestDao.save(guest);
        log.info("2.Change age");
        guest.setAge(NEW_AGE);
        log.info("3.Update guest");
        guestDao.save(guest);
        log.info("4.Get saved guest");
        Guests savedGuest = guestDao.findById(guest.getGuestId()).orElse(null);

        log.info("5.CHECK");
        assertNotNull("Check get guest is not null", savedGuest);
        assertEquals("Check name", "Azat", savedGuest.getName());
        assertEquals("Check surname", "Kushkarov", savedGuest.getSurname());
        assertEquals("Check age", NEW_AGE, savedGuest.getAge());
    }

    @Test
    public void checkDeleteGuest() {
        Guests guest = Guests.builder()
                .name("Azat")
                .surname("Kushkarov")
                .age(21L)
                .build();
        log.info("1.Save guest");
        guestDao.save(guest);
        log.info("2.Check saved guest");
        Guests savedGuest = guestDao.findById(guest.getGuestId()).orElse(null);
        assertNotNull("Check get guest is not null", savedGuest);
        log.info("3.Delete guest");
        guestDao.delete(guest);
        log.info("4.Check deleted guest");
        Guests deletedGuest = guestDao.findById(guest.getGuestId()).orElse(null);
        assertEquals("Check that deleteGuest  is null", null, deletedGuest);
    }
}