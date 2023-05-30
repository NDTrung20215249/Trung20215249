package hust.soict.dsai.aims.media;


public class Track implements Playable {
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	private String title;
	private int length;
    public void addTrack() {
		
	}

	public void removeTrack() {
		
	}
	
	public Track() {		
		Track myTrack = new Track();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle()); 

		System.out.println("DVD length: " + this.getLength()); 
	}

}
