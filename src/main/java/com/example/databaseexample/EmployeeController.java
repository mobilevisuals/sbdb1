package com.example.databaseexample;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eyvind
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;
//vi kan lägga till method = RequestMethod.GET för att markera tydligt att det är GET,
    //men det behövs egentligen inte, eftersom GET är standard.
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Optional<Employee> getEmployee(@PathVariable("id") long id) {
        return employeeService.getEmployee(id);
    }



}
