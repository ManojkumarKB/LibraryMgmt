package com.library.pract.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Section")
public class Section {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Section_id")
	private int Section_id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Category_id")
	private Category category;

	public int getSection_id() 
	{
		return Section_id;
	}

	public void setSection_id(int section_id)
	{
		Section_id = section_id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Category getCategory() 
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}
}
