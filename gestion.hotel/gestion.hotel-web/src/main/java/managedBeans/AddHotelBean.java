package managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import business.IManageHotelsLocal;
import persistence.Adress;
import persistence.Hotel;
import persistence.Stars;

@ManagedBean
public class AddHotelBean {

	private String name;
	private String city;
	private int zipCode;
	private Stars selectStars;
	private List<Stars> stars;
	
	@EJB
	IManageHotelsLocal hotelsLocal;
	

	@PostConstruct
	public void init(){
		
		stars = new ArrayList<Stars>();
		stars.add(Stars.one);
		stars.add(Stars.two);
		stars.add(Stars.three);
		stars.add(Stars.four);
		stars.add(Stars.five);
		
	}
	
	public String addHotel(){
		Adress adress = new Adress();
		adress.setCity(city);
		adress.setZipCode(zipCode);
		Hotel hotel = new Hotel();
		hotel.setAdress(adress);
		hotel.setName(name);
		hotel.setStars(selectStars);
		hotelsLocal.addHotel(hotel);
		return null;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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

	public Stars getSelectStars() {
		return selectStars;
	}

	public void setSelectStars(Stars selectStars) {
		this.selectStars = selectStars;
	}

	public List<Stars> getStars() {
		return stars;
	}

	public void setStars(List<Stars> stars) {
		this.stars = stars;
	}
	
	
	
}
