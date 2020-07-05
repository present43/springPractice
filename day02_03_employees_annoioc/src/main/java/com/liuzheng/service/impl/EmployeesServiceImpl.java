package com.liuzheng.service.impl;

import com.liuzheng.dao.EmployeesDAO;
import com.liuzheng.pojo.Employees;
import com.liuzheng.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 服务层
@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesDAO employeesDAO;

    // set 方法注入对象 使用注解注入就不用set 方法了
    // public void setEmployeesDAO(EmployeesDAO employeesDAO) {
    //    this.employeesDAO = employeesDAO;
    //  }

    public Employees findEmployeesById() {
        return null;
    }

    public List<Employees> findAllEmployees() {
        return employeesDAO.findAllEmployees();
    }

    public void addEmployees(Integer id) {

    }

    public void updateEmployees(Integer id) {

    }

    public void deleteEmployees(Integer id) {

    }
}
