package ru.shundalov.crm.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.Services;

@Repository
public interface ServicesDao extends CrudRepository<Services, Long> {
}