package com.qa.mylibrary;

public class Runner {
	
	public static void main(String[] args) {
		Book b1 = new Book("War of The Worlds", 1001001, "H.G. Wells", "Pearson", 1897);
		Magazine m1 = new Magazine("TIME", 1002001, "Time Inc", 2022);

		java.util.ArrayList<Publication> publications = new java.util.ArrayList<>();

		publication.add(p1);
		publication.add(p1);

		for (Publication p : publications) {
			if (p instanceof Book) {
				Book b = (Book) p;
				b.bookmark();
			}
			p.print();
			p.makeNoise();
		}

		// basically this:
		Publication p1 = new Book("War of The Worlds", 1001001, "H.G. Wells", "Pearson", 1897);
		Publication p2 = new Magazine("TIME", 1002001, "Time Inc", 2022);

		System.out.println(p1.getClass().getSimpleName());
		System.out.println(p2.getClass().getSimpleName());

	}

}