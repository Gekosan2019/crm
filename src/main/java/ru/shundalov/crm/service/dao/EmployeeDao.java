package ru.shundalov.crm.service.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.shundalov.crm.model.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long> {
}
