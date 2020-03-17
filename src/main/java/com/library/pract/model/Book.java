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
@Table(name="Book")
public class Book {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "Book_id")
	 private long id;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "author_id")
	 private Author author;
	 
	 @ManyToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="publisher_id")
	 private Publisher publisher;
	 
	 @Column(name="isbn")
	 private long isbn;
	 
	 @Column(name="Title")
	 private String title;
	 
	 
	 @ManyToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="Section_id")
	 private Section section;
	 
	@Column(name="Amount")
	 private int Amount;
	 
	 @Column(name="Edition")
	 private int Edition;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public int getEdition() {
		return Edition;
	}

	public void setEdition(int edition) {
		Edition = edition;
	}
	
}
