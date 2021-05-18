package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private CompanyFacade companyFacade;
    @Autowired
    private EmployeeFacade employeeFacade;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    @Test
    void testEmployeeSelectByPartOfTheSurname() throws EmployeeException {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        //When
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        List<Employee> expectedEmployeeName = employeeFacade.selectEmployeeByPartOfTheSurname("mit");
        //Then
        assertEquals(1, expectedEmployeeName.size());
        //CleanUp
        employeeDao.deleteAll();
    }

    @Test
    void testCompanySelectByPartOfTheName() throws CompanyException {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        List<Company> expectedCompanyName = companyFacade.selectCompanyByPartOfTheName("ter");

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);
        assertEquals(2, expectedCompanyName.size());
        //CleanUp?
        companyDao.deleteAll();
//
//        companyDao.deleteById(softwareMachineId);
//        companyDao.deleteById(dataMaestersId);
//        companyDao.deleteById(greyMatterId);

    }
}
