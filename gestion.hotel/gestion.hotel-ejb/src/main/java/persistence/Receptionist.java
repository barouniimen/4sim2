package persistence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="r")
public class Receptionist extends Employee {
	private String post;

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}
	
}
