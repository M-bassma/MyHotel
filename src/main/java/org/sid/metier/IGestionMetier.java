package org.sid.metier;

import java.util.Date;
import java.util.List;

import org.sid.entities.Hotel;

public interface IGestionMetier {
	Hotel get(String libelle);
	public List<Hotel> listHotel();
	public List<Hotel> listHotelVille(String ville);
	public List<Hotel> listHotelVP(String ville,Date debut,Date fin);
	public List<Hotel> listHotelVPR(String ville,Date debut,Date fin,Integer number,String type);
}
