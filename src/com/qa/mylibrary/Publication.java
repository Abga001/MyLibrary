package com.qa.mylibrary;

public abstract class Publication extends Object {
	
	private String name;
	private int id;
	private String author;
	private String publisher;
	private int year;
	
	public Publication() {
		super();
	}
	
	public Publication(String name, int id) {
		super(name, id, author, publisher, year);
		this.name = name;
		this.id = id;
	}
	
	public Publication(String name, int id, String author, String publisher, int year) {
		super(name, id, publisher);
		this.name = name;
		this.id = id;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
	}

	public void print() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(author);
	}
	
	public abstract void takePublication();

}

}
