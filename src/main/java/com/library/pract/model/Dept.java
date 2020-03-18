package com.library.pract.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "Dept")
public class Dept {
 
    @Id
    @GeneratedValue
    @Column(name = "Dept_id")
    private long id;
 
    @Column(name = "Dept_name")
    private String Dept_Name;
 
    public Dept(long id, String dept_Name) {
		super();
		this.id = id;
		Dept_Name = dept_Name;
	}

	public String getDept_Name() {
		return Dept_Name;
	}

	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}

	public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
   
 
}