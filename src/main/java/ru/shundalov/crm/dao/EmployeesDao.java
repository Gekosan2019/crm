package ru.shundalov.crm.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.Employees;

@Repository
public interface EmployeesDao extends CrudRepository<Employees, Long> {
}
