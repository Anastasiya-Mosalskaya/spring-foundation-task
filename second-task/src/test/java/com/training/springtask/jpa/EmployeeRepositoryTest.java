package com.training.springtask.jpa;

import com.training.springtask.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testThatEmployeeIsSavedToDatabase() {
        employeeRepository.save(new Employee("Cillian Murphy", "HR"));
        List<Employee> employees = (List<Employee>) employeeRepository.findAll();
        Employee employee = employees.get(0);
        assertNotNull(employee);
        assertEquals("Cillian Murphy", employee.getName());
    }
}
