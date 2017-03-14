package persistence;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
@Embeddable
public class Adress implements Serializable{

	//private int id;
	private String city;
	private Integer zipCode;
	//private Hotel hotel;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
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
