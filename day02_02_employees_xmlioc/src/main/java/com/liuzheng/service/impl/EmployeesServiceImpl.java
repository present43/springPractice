package com.liuzheng.service.impl;

import com.liuzheng.dao.EmployeesDAO;
import com.liuzheng.pojo.Employees;
import com.liuzheng.service.EmployeesService;

import java.util.List;

// 服务层
public class EmployeesServiceImpl implements EmployeesService {

    private EmployeesDAO employeesDAO;

    // set 方法注入对象
    public void setEmployeesDAO(EmployeesDAO employeesDAO) {
        this.employeesDAO = employeesDAO;
    }

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
