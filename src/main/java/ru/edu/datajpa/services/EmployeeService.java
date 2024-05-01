package ru.edu.datajpa.services;

import org.springframework.transaction.annotation.Transactional;
import ru.edu.datajpa.entity.Employee;
import ru.edu.datajpa.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void test() {
        Employee employee = repository.getById(1L);
        employee.getEquipments().forEach(
                equipment ->
                        System.out.println("employee: " + employee.getName() + " has equipment: " + equipment.getName() + " address: " + employee.getAddress().getStreet())
        );

        employee.getProjects().forEach(project -> System.out.println("employee: " + employee.getName() + " works in " + project.getName()));
    }

}
