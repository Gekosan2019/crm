package ru.shundalov.crm.service.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.Service;

@Repository
public interface ServicesDao extends CrudRepository<Service, Long> {
}