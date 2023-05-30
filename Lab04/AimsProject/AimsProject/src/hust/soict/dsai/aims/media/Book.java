package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media{
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	private List<String> authors = new ArrayList<String>();
	
	public void addAuthor(String authorName) {
		 for (int i = 0; i < authors.size(); i++) {
	            if (authors.get(i) == authorName) {
	                return;
	            }
	        }
	        authors.add(authorName);
	}

	public void removeAuthor(String authorName) {
		for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i) == authorName) {
                authors.remove(i);
            }
        }
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}

}
