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
 
    @Column(name = "name")
    private String name;
 
    public Dept() { }
 
    public Dept(String name) {
        this.name = name;
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
}