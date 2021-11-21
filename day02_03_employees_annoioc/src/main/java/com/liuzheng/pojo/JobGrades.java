package com.liuzheng.pojo;


public class JobGrades {

  private String gradeLevel;
  private long lowestSal;
  private long highestSal;

  public String getGradeLevel() {
    return gradeLevel;
  }

  public void setGradeLevel(String gradeLevel) {
    this.gradeLevel = gradeLevel;
  }


  public long getLowestSal() {
    return lowestSal;
  }

  public void setLowestSal(long lowestSal) {
    this.lowestSal = lowestSal;
  }


  public long getHighestSal() {
    return highestSal;
  }

  public void setHighestSal(long highestSal) {
    this.highestSal = highestSal;
  }

  @Override
  public String toString() {
    return "JobGrades{" +
            "gradeLevel='" + gradeLevel + '\'' +
            ", lowestSal=" + lowestSal +
            ", highestSal=" + highestSal +
            '}';
  }

}
