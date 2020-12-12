package com.ashsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BOOK_DTLS")
public class BookEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "BOOK_ID")
	private Integer bookId;
	
	@Column(name = "BOOK_NAME")
	private String bookName;
	
	@Column(name = "BOOK_PRICE")
	private String bookPrice;
	
	@Column(name = "AUTHOR_NAME")
	private String authorName;
}
