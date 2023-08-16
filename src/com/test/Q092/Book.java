package com.test.Q092;

import java.util.Set;

//요구사항
//Book 클래스를 설계하시오.

class Book {
	
	

	private String title;
	private int price;
	private String author;
	private int page;
	private String isbn;
	private String pubYear = "2019";
	private String publisher;

	// getter, setter
	


	public String getTitle() {
				
		return title;
	}
	
	public void setTitle(String title) {
		
		if(title.length() > 50) {
			return;
		}
		
		for(int i=0; i<title.length(); i++) {
			char c = title.charAt(i);
			
			if ((c < '가' || c > '힣') && (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9') && c != ' ') {
				return;
			}
		}
		this.title = title;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(price > 0 && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("가격이 올바르지 않습니다.");
		}
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		if(page >= 1) {
			this.page = page;
		} else {
			System.out.println("페이지는 적어도 1개 이상이여야합니다.");
		}
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getPubYear() {
		
		this.pubYear = pubYear;
		
		return String.format("%s\n", pubYear);
		
	}
	
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String info() {
		
		return String.format("제목: %s\n가격: %,d원\n저자: %s\n출판사: %s\n발행년도: %s년\nISBN: %s\n페이지: %,d장", this.title, this.price, this.author, this.publisher, this.pubYear, this.isbn, this.page);
	}
}