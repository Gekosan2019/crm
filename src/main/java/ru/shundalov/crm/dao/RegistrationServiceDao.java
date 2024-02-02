package ru.shundalov.crm.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.RegistrationService;

@Repository
public interface RegistrationServiceDao extends CrudRepository<RegistrationService, Long> {
}
