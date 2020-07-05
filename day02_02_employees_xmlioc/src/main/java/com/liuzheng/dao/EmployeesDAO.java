package com.liuzheng.dao;

import com.liuzheng.pojo.Employees;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class EmployeesDAO {

    private QueryRunner runner;

    //set 方法注入对象
    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    // 以下是DAO 层操作数据库的方法

    // 查找一个员工的方法
    public Employees findEmployeesById() {

        return null;
    }

    // 查找所有员工的方法
    public List<Employees> findAllEmployees() {
        try {
            return runner.query(" select * from employees " , new BeanListHandler<Employees>(Employees.class));
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }
    }

    // 增加一个员工的方法 根据主键
    void addEmployees(Integer id) {

    }

    // 修改一个员工的方法 根据主键
    void updateEmployees(Integer id) {

    }

    // 删除一个员工的方法 根据主键
    void deleteEmployees(Integer id) {

    }

}
