package ru.shundalov.crm.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.shundalov.crm.model.EmplPositions;
import ru.shundalov.crm.model.Employees;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeesDaoTest {

    @Autowired
    EmployeesDao employeesDao;
    @Autowired
    EmplPositionsDao emplPositionsDao;

    @Test
    public void checkSaved() {
        EmplPositions emplPositions = EmplPositions.builder()
                .namePosition("HEADER")
                .build();
        Employees employees = Employees.builder()
                .name("Sofia")
                .surname("Lipskaya")
                .emplPositions(emplPositions)
                .build();

        log.info("1.Save emplPositions because employees have FK on emplPositions");
        emplPositionsDao.save(emplPositions);
        log.info("2.Save employee");
        employeesDao.save(employees);
        log.info("3.Get saved employees");
        Employees savedEmployee = employeesDao.findById(employees.getEmplId()).orElse(null);

        log.info("4.CHECK");
        assertNotNull("Check get employee is not null", savedEmployee);
        assertEquals("Check name", "Sofia", savedEmployee.getName());
        assertEquals("Check surname", "Lipskaya", savedEmployee.getSurname());
        assertEquals("Check emplPosititions", emplPositions, savedEmployee.getEmplPositions());
    }

    @Test
    public void checkUpdate() {
        EmplPositions emplPositions = EmplPositions.builder()
                .namePosition("HEADER")
                .build();
        Employees employees = Employees.builder()
                .name("Sofia")
                .surname("Lipskaya")
                .emplPositions(emplPositions)
                .build();

        log.info("1.Save emplPositions because employees have FK on emplPositions");
        emplPositionsDao.save(emplPositions);
        log.info("2.Save employee");
        employeesDao.save(employees);
        log.info("3.Update employee");
        employees.setSurname("Shundalova");
        employeesDao.save(employees);
        log.info("4. Check");
        Employees changedEmpl = employeesDao.findById(employees.getEmplId()).orElse(null);
        assertNotNull("Check get employee is not null", changedEmpl);
        assertEquals("Check name", "Sofia", changedEmpl.getName());
        assertEquals("Check surname", "Shundalova", changedEmpl.getSurname());
        assertEquals("Check emplPosititions", emplPositions, changedEmpl.getEmplPositions());
    }

    @Test
    public void checkDelete() {

    }
}