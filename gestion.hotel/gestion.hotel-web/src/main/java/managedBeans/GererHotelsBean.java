package managedBeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import business.IManageHotelsLocal;
import persistence.Hotel;

@ManagedBean
@ViewScoped
public class GererHotelsBean {
	private List<Hotel> hotels;
	private Hotel selectedHotel;
	private Boolean isSelected;
	@EJB
	IManageHotelsLocal hotelsLocal;

	@PostConstruct
	public void init() {
		isSelected = false;
		selectedHotel = new Hotel();
		hotels = hotelsLocal.getAllHotels();
	}
	
	public String updateHotel(){
		hotelsLocal.updateHotel(selectedHotel);
		return "";
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	public Hotel getSelectedHotel() {
		return selectedHotel;
	}

	public void setSelectedHotel(Hotel selectedHotel) {
		this.selectedHotel = selectedHotel;
	}

	public Boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}

}
