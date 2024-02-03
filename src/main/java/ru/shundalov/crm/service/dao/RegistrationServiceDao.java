package ru.shundalov.crm.service.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.RegistrationService;

@Repository
// TODO проверить ключ
public interface RegistrationServiceDao extends CrudRepository<RegistrationService, Long> {
}
