package ru.shundalov.crm.service.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.EmplPosition;

@Repository
public interface EmplPositionsDao extends CrudRepository<EmplPosition, Long> {
}
