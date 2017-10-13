package com.self.learning.entity;

import javax.persistence.*;

@Table(name = "t_department")
@Entity
public class Department {
    private Integer id;
    private String deptName;

    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "dept_name")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
