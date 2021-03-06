package com.kodilla.hibernate.manytomany;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@Service
@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Company.selectFirstThreeDigitsFromCompanyName",
                query = "SELECT * FROM COMPANIES\n" +
                        "WHERE LEFT (company_name, 3) LIKE company_name",
                resultClass = Company.class
        ),
        @NamedNativeQuery(
                name = "Company.selectCompanyByPartOfTheName",
                query = "SELECT * FROM COMPANIES\n" +
                        "WHERE company_name LIKE concat('%',:param, '%')",
                resultClass = Company.class
        )
})
@Entity
@Table(name = "COMPANIES")
public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}