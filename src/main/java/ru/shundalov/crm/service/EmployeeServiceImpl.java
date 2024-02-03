package ru.shundalov.crm.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.shundalov.crm.service.dao.EmployeeDao;
import ru.shundalov.crm.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public Employee saveOrUpdateEmployee(Employee employee) {
        log.info("save/update employee");
        return employeeDao.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        log.info("get employee by Id");
        return employeeDao.findById(employeeId).orElse(null);
    }

    @Override
    public void deleteEmployeeById(Long employeeId) {
        log.info("delete employee by Id");
        employeeDao.deleteById(employeeId);
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        employeeDao.findAll().forEach(employees::add);
        return employees;
    }
}