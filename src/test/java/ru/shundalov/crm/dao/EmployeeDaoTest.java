package ru.shundalov.crm.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.shundalov.crm.model.EmplPosition;
import ru.shundalov.crm.model.Employee;
import ru.shundalov.crm.service.GuestService;
import ru.shundalov.crm.service.dao.EmplPositionsDao;
import ru.shundalov.crm.service.dao.EmployeeDao;

import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeDaoTest {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    EmplPositionsDao emplPositionsDao;

    @Autowired
    GuestService guestService;

    @Test
    public void checkSaved() {
        EmplPosition emplPosition = EmplPosition.builder()
                .namePosition("HEADER")
                .build();
        Employee employee = ru.shundalov.crm.model.Employee.builder()
                .name("Sofia")
                .surname("Lipskaya")
                .emplPosition(emplPosition)
                .build();

        log.info("1.Save emplPositions because employees have FK on emplPositions");
        emplPositionsDao.save(emplPosition);
        log.info("2.Save employee");
        employeeDao.save(employee);
        log.info("3.Get saved employees");
        Employee savedEmployee = employeeDao.findById(employee.getEmplId()).orElse(null);

        log.info("4.CHECK");
        assertNotNull("Check get employee is not null", savedEmployee);
        assertEquals("Check name", "Sofia", savedEmployee.getName());
        assertEquals("Check surname", "Lipskaya", savedEmployee.getSurname());
        assertEquals("Check emplPosititions", emplPosition, savedEmployee.getEmplPosition());
    }

    @Test
    public void checkUpdate() {
        EmplPosition emplPosition = EmplPosition.builder()
                .namePosition("HEADER")
                .build();
        Employee employee = Employee.builder()
                .name("Sofia")
                .surname("Lipskaya")
                .emplPosition(emplPosition)
                .build();

        log.info("1.Save emplPositions because employees have FK on emplPositions");
        emplPositionsDao.save(emplPosition);
        log.info("2.Save employee");
        employeeDao.save(employee);
        log.info("3.Update employee");
        employee.setSurname("Shundalova");
        employeeDao.save(employee);
        log.info("4. Check");
        Employee changedEmpl = employeeDao.findById(employee.getEmplId()).orElse(null);
        assertNotNull("Check get employee is not null", changedEmpl);
        assertEquals("Check name", "Sofia", changedEmpl.getName());
        assertEquals("Check surname", "Shundalova", changedEmpl.getSurname());
        assertEquals("Check emplPosititions", emplPosition, changedEmpl.getEmplPosition());
    }

    @Test
    public void checkDelete() {

    }
}