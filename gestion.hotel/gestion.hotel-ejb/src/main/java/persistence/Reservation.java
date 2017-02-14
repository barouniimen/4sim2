package persistence;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Reservation {

	private ReservationPk pk;
	private int daysToStay;
	private int rommNumber;
	private Client client;
	private Hotel hotel;

	public int getDaysToStay() {
		return daysToStay;
	}

	public void setDaysToStay(int daysToStay) {
		this.daysToStay = daysToStay;
	}

	@EmbeddedId
	public ReservationPk getPk() {
		return pk;
	}

	public void setPk(ReservationPk pk) {
		this.pk = pk;
	}

	public int getRommNumber() {
		return rommNumber;
	}

	public void setRommNumber(int rommNumber) {
		this.rommNumber = rommNumber;
	}

	@ManyToOne
	@JoinColumn(name = "idClient", insertable = false, updatable = false)
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@ManyToOne
	@JoinColumn(name = "idHotel", insertable = false, updatable = false)
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
}
