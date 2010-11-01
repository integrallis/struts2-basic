package com.integrallis.domain;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
	private String isbn;
	private String title;
	private Date publishedOn;
	private Double price;
	private int version = -1;
	private Author author;
	

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishedOn() {
		return publishedOn;
	}

	public void setPublishedOn(Date publishedOn) {
		this.publishedOn = publishedOn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	private void setVersion(int version) {
		this.version = version;
	}

	public int getVersion() {
		return version;
	}

	public Author getAuthor() {
		return author;
	}	
}