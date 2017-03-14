package business;

import java.util.List;

import javax.ejb.Remote;

import persistence.Agency;
import persistence.Employee;
import persistence.Hotel;

@Remote
public interface IManageHotelsRemote {

	void addHotel(Hotel hotel);
	void removeHotel(Hotel hotel);
	void updateHotel(Hotel hotel);
	Hotel getById(int id);
	void assignEmployee(Employee employee, Hotel hotel);
	List<Hotel> getAllHotels();
	void addAgency(Agency agency);
	void assignAgencyToHotel(Hotel hotel, Agency agency);
	void addEmployee(Employee employee);
	
}
