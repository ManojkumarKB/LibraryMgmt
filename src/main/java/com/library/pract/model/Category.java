package com.library.pract.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Category_id")
	private int Category_id;
	
	@Column(name="name")
	private String Name;

	public int getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(int category_id) {
		Category_id = category_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	

}
