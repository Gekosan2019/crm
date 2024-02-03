package ru.shundalov.crm.service.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.Room;

@Repository
public interface RoomsDao extends CrudRepository<Room, Long> {
}
