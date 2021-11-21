package com.liuzheng.dao;

import com.liuzheng.pojo.JobGrades;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

public class JobGradesDAO {
    @Autowired
    QueryRunner runner;

    //查找所有级别的工资信息
    public List<JobGrades> findAllJobGrades(){
        try {
            return  runner.query("select * from job_grades", new BeanListHandler<JobGrades>(JobGrades.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    // 更新 级别的方法
    public void  uaDataJobGrades(JobGrades jobGrades){
        try {
            runner.update("UPDATE job_grades set lowest_sal =? , highest_sal =?  where grade_level =? ",jobGrades.getLowestSal(),jobGrades.getHighestSal(),jobGrades.getGradeLevel());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //添加
    public void saveJobGrades(JobGrades jobGrades){
        try {
            runner.update("insert into account(grade_level,lowest_sal,highest_sal) values(?,?,?)",jobGrades.getGradeLevel(),jobGrades.getLowestSal(),jobGrades.getHighestSal());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //根据级别查询工资
    //查找所有级别的工资信息
    public JobGrades findJobGradesByLv(String gradeLevel ){
        try {
            List<JobGrades> g = runner.query("select * from job_grades where grade_level = ? ",new BeanListHandler<JobGrades>(JobGrades.class) , gradeLevel );
            if(gradeLevel == null || g.size() == 0){
                return  null;
            }
            return g.get(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
