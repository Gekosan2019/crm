package ru.shundalov.crm.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.GuestRegistration;

@Repository
public interface GuestRegistrationDao extends CrudRepository<GuestRegistration, Long> {
}
