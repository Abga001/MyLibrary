package com.qa.mylibrary;

public abstract class Book extends Publication {
	
	private boolean borrow() 

	
	
	public Book() {
		super();
	}
	
	public Book(String name, int id, String author, String publisher, int year) {
		super(name, id, author, publisher, year);
		this.borrow = borrow;
	}
	
	public Book(String name, int id, String publisher) {
		super(name, id, publisher);
	}

	public void print() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(author);
	}
	
	public abstract void takePublication();

}

}
