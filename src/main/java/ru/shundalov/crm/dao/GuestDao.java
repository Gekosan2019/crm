package ru.shundalov.crm.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.Guests;

@Repository
public interface GuestDao extends CrudRepository<Guests, Long> {
}