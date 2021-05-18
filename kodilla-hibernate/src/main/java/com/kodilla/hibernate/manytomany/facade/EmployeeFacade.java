package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeFacade {

    @Autowired
    EmployeeDao employeeDao;

    List<Employee> selectEmployeeByPartOfTheSurname(String param) throws EmployeeException {
        return employeeDao.selectEmployeeByPartOfTheSurname(param);
    }
}
