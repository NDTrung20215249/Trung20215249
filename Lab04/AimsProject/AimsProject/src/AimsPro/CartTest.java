package AimsPro;

public class CartTest {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DVD dvd3 = new DVD("Aladin", "Animation", 18.99f);
		
		cart.addDVD(dvd1);
		cart.addDVD(dvd2);
		cart.addDVD(dvd3);
		
		cart.print();

	}

}
