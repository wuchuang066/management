package com.example.pojo;

import java.util.Date;

public class MgEmp {
    private Integer id;

    private Integer empId;

    private String empName;

    private Integer deptId;

    private String deptName;

    private String sex;

    private String contact;

    private String empGrade;

    private String empWorkload;

    private String empUsername;

    private String empPassword;

    private Date empCreatedate;

    private String empFilepath;

    private String filePath;

    private Integer createDate;

    private MgDept mgDept;

    public MgDept getMgDept() {
        return mgDept;
    }

    public void setMgDept(MgDept mgDept) {
        this.mgDept = mgDept;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmpGrade() {
        return empGrade;
    }

    public void setEmpGrade(String empGrade) {
        this.empGrade = empGrade;
    }

    public String getEmpWorkload() {
        return empWorkload;
    }

    public void setEmpWorkload(String empWorkload) {
        this.empWorkload = empWorkload;
    }

    public String getEmpUsername() {
        return empUsername;
    }

    public void setEmpUsername(String empUsername) {
        this.empUsername = empUsername;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public Date getEmpCreatedate() {
        return empCreatedate;
    }

    public void setEmpCreatedate(Date empCreatedate) {
        this.empCreatedate = empCreatedate;
    }

    public String getEmpFilepath() {
        return empFilepath;
    }

    public void setEmpFilepath(String empFilepath) {
        this.empFilepath = empFilepath;
    }
}