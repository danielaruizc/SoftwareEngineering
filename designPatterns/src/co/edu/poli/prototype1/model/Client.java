package co.edu.poli.prototype1.model;

/**
 * Design Patterns: Basic Prototype
 * 
 * @author daniela 
 * @since 22.03.23
 */
public class Client {

	public static void main(String[] args) {

		Book b = new Book("ABC111", "Gabriel Garc�a Marqu�z", 2010, "Oveja Negra", "La Hojarasca", new int[120]);
		System.out.println(b);

		Book cloneBook1 = (Book) b.cloneObj();

		cloneBook1.setISBN("XYZ999");
		cloneBook1.setYear(2021);
		System.out.println(cloneBook1);

	}

}
