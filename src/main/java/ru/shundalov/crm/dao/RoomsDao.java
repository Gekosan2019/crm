package ru.shundalov.crm.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.Rooms;

@Repository
public interface RoomsDao extends CrudRepository<Rooms, Long> {
}
