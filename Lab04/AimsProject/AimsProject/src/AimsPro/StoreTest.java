package AimsPro;

public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store(3);
		DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DVD dvd2 = new DVD("The Spider Man", "Film", "Sam Raimi", 88, 20.95f);
		DVD dvd3 = new DVD("Batman");
		DVD dvd4 = new DVD("Superman");
		store.adddvd(dvd1);
		store.adddvd(dvd2);
		store.adddvd(dvd3);
		store.adddvd(dvd4);
		store.removedvd(dvd4);
		store.removedvd(dvd1);
		store.removedvd(dvd2);
	}

}
