package org.sid.metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.sid.dao.HotelRepository;
import org.sid.entities.Chambre;
import org.sid.entities.Hotel;
import org.sid.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class GestionMetierImpl implements IGestionMetier {
	@Autowired
	private HotelRepository hotelRepository;
	
	@Transactional
	@Override
	public Hotel get(String libelle) {
		Hotel hotel = hotelRepository.getHotel(libelle);
		return hotel;
	}
	@Override
	public List<Hotel> listHotelVille(String ville) {
		
		return hotelRepository.listHotelVille(ville);
	}
	@Override
	public List<Hotel> listHotelVP(String ville, Date debut, Date fin) {
		List<Hotel> HotelVille=hotelRepository.listHotelVille(ville);
		boolean ok;
		List<Hotel> HotelVP=new ArrayList<Hotel>();
		for (Hotel hotel : HotelVille) {
			ok=false;
			for (Chambre chambre : hotel.getChambres()) {
				if(chambre.getNbChambres()-chambre.getReservations().size()>0 && chambre.getType().equals("single room"))
					ok=true;
				else {
					if(chambre.getNbChambres()-chambre.getReservations().size()==0 && chambre.getType().equals("single room")) {
						for (Reservation reservation : chambre.getReservations()) {
							if(reservation.getFin().before(debut) && debut.before(fin))
								ok=true;
						}
					}
				}
			}
			if(ok==true)
				HotelVP.add(hotel);
		}
		return HotelVP;
	}
	@Override
	public List<Hotel> listHotelVPR(String ville, Date debut, Date fin, Integer number, String type) {
		List<Hotel> HotelVille=hotelRepository.listHotelVille(ville);
		boolean ok;
		int compt;
		List<Hotel> HotelVPR=new ArrayList<Hotel>();
		for (Hotel hotel : HotelVille) {
			ok=false;
			for (Chambre chambre : hotel.getChambres()) {
				compt=0;
				if(chambre.getNbChambres()-chambre.getReservations().size()>=number && chambre.getType().equals(type))
					ok=true;
				else {
					if(chambre.getNbChambres()-chambre.getReservations().size()< number && chambre.getType().equals(type)) {
						for (Reservation reservation : chambre.getReservations()) {
							if(reservation.getFin().before(debut) && debut.before(fin))
								compt++;
						}
						if(number==chambre.getNbChambres()+compt)
							ok=true;
					}
				}
			}
			if(ok==true)
				HotelVPR.add(hotel);
		}
		return HotelVPR;
	}
	@Override
	public List<Hotel> listHotel() {
		
		return hotelRepository.findAll();
	}
}
