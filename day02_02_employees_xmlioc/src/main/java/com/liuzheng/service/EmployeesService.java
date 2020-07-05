package com.liuzheng.service;

import com.liuzheng.pojo.Employees;

import java.util.List;

public interface EmployeesService {
    // 查找一个员工的方法
    Employees findEmployeesById();
    // 查找所有员工的方法
    List<Employees> findAllEmployees();
    // 增加一个员工的方法 根据主键
    void addEmployees(Integer id);
    // 修改一个员工的方法 根据主键
    void updateEmployees(Integer id);
    // 删除一个员工的方法 根据主键
    void deleteEmployees(Integer id);
}
