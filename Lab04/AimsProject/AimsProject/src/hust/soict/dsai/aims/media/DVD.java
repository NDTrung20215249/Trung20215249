package hust.soict.dsai.aims.media;

public class DVD extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;
	public DVD (String title) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs; 
		this.title = title;
	}
	
	public DVD(String title, String category, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs; 
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	

	public DVD(String title, String category, String director, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs; 
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DVD(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs; 
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public String toString() {
		return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
	}
	public boolean isMatch(String title) {
		return title == this.getTitle();
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle()); 

		System.out.println("DVD length: " + this.getLength());		
	}
}
