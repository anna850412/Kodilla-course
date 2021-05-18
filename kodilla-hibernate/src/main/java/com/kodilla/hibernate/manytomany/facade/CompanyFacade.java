package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Repository
public class CompanyFacade {
    @Autowired
    CompanyDao companyDao;

    public List<Company> selectCompanyByPartOfTheName(String param) throws CompanyException {
        return companyDao.selectCompanyByPartOfTheName(param);
    }
}
