package com.codeline.sampleProject.Controller;

import com.codeline.sampleProject.Models.Employee;
import com.codeline.sampleProject.Models.Salary;
import com.codeline.sampleProject.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SalaryController {
    @Autowired
    SalaryService salaryService;
    @RequestMapping("salary/create")
    public void saveSalary () {
        createSalary();
    }
    @RequestMapping("salary/get")
    public List<Salary> getSalary () {
        return salaryService.getSalary();
    }
    public void createSalary() {

        Salary salary = new Salary();
        salary.setAmount(1000.0);
        salary.setBonus(400.0);
        salary.setCreatedDate(new Date());
        salary.setIsActive(true);
        salary.setAllowances(50.0);
        salary.setOverTimeAmount(50.0);
        salary.setDeductions(100.00);
        salary.setCurrency("OMR");
        salary.setHealthCareContribution(50.0);
        salary.setPerDiem(12.0);
        salaryService.saveSalary(salary);
    }

}
