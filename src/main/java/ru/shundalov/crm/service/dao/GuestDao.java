package ru.shundalov.crm.service.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.Guest;

@Repository
public interface GuestDao extends CrudRepository<Guest, Long> {
}