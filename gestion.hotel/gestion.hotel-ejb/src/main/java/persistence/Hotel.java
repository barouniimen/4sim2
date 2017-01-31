package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {

	
	private int id;
	private String name;
	private Stars stars;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Stars getStars() {
		return stars;
	}
	public void setStars(Stars stars) {
		this.stars = stars;
	}
	
	
	
}
