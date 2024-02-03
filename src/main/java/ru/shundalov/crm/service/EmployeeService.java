package ru.shundalov.crm.service;

import ru.shundalov.crm.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveOrUpdateEmployee(Employee employee);

    Employee getEmployeeById(Long employeeId);

    void deleteEmployeeById(Long employeeId);

    List<Employee> findAllEmployee();
}