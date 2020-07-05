package com.liuzheng.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Employees {

  private Long employeeId;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private String jobId;
  private Double salary;
  private Double commissionPct;
  private Long managerId;
  private Long departmentId;
  private Date hiredate;


}
