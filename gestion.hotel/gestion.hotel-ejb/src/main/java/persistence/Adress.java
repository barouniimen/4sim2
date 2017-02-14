package persistence;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
@Embeddable
public class Adress {

	//private int id;
	private String city;
	private int zipCode;
	//private Hotel hotel;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	@OneToOne(mappedBy="adress")
//	public Hotel getHotel() {
//		return hotel;
//	}
//	public void setHotel(Hotel hotel) {
//		this.hotel = hotel;
//	}
//	
	
}
