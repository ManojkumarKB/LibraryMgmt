package com.library.pract.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
 
@Entity
@Table(name = "Member")
@SecondaryTable(name = "Dept")
@SecondaryTable(name="Address")
public class Member {
 
    @Id
    @GeneratedValue
    @Column(name = "Member_id")
    private long id;
 
    @Column(name = "Name")
    private String Name;
    
    @JoinColumn(name = "Dept_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Dept dept;
    
    @JoinColumn(name = "Address_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Dept Addr;

    @Column(name="Gender")
    private String Gender;
    
    @Column(name="Email")
    private String Email;
    
    @Column(name="phone_no")
    private String Ph_no;

    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
    

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Dept getAddr() {
		return Addr;
	}

	public void setAddr(Dept addr) {
		this.Addr = addr;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getPh_no() {
		return Ph_no;
	}

	public void setPh_no(String ph_no) {
		this.Ph_no = ph_no;
	}
    
  }