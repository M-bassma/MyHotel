package org.sid;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.sid.dao.ChambreRepository;
import org.sid.dao.HotelRepository;
import org.sid.dao.ReservationRepository;
import org.sid.entities.Chambre;
import org.sid.entities.Hotel;
import org.sid.entities.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class GestionHotels1Application implements CommandLineRunner {
	@Autowired
	HotelRepository hotelRepository;
	 @Autowired
	 ChambreRepository chambreRepository;
	 @Autowired
	 ReservationRepository reservationRepository;
	 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	 
	 public static void main(String[] args) {
			SpringApplication.run(GestionHotels1Application.class, args);
	}
	 public void run(String... args) throws Exception {
		 /******ifrane******/
		 /*
		 Hotel h1=hotelRepository.save(new Hotel("Relais Ras El Maa", "IFRANE", "2.5 km to City centre","7", "Good" ,"161", "E:\\Gestion_hotels\\Ifrane\\Relais Ras El Maa"));
		 Hotel h2=hotelRepository.save(new Hotel("Le Chamonix", "IFRANE", "0.8 km to City centre","7", "/", "23", "E:\\Gestion_hotels\\Ifrane\\Le Chamonix"));
		 Hotel h3=hotelRepository.save(new Hotel("Grand Ifrane", "IFRANE", "1.0 km to City centre","7", "Good", "275", "E:\\Gestion_hotels\\Ifrane\\Grand Ifrane"));
		 Hotel h4=hotelRepository.save(new Hotel("Tamanoucht", "IFRANE", "8.9 km to City centre","7" ,"Good", "68", "E:\\Gestion_hotels\\Ifrane\\Tamanoucht"));
		 Hotel h5=hotelRepository.save(new Hotel("La Rose Blanche", "IFRANE", "7.0 km to City centre","8" ,"Excellent" ,"13", "E:\\Gestion_hotels\\Ifrane\\La Rose Blanche"));
		 Hotel h6=hotelRepository.save(new Hotel("Gite Du Barrage Ben Smim", "IFRANE", "8.5 km to City centre","8.4", "Very good" ,"0", "E:\\Gestion_hotels\\Ifrane\\Gite Du Barrage Ben Smim"));
		 Hotel h7=hotelRepository.save(new Hotel("Ifrane Palace", "IFRANE", "1.9 km to City centre","7.3", "/"  ,"161", "E:\\Gestion_hotels\\Ifrane\\Ifrane Palace"));
		 Hotel h8=hotelRepository.save(new Hotel("Complexe Touristique Relais Ras El Maa", "IFRANE", "1.0 km to City centre","7.9", "Good", "10", "E:\\Gestion_hotels\\Ifrane\\Complexe Touristique Relais Ras El Maa"));
		 
		 Chambre c1=chambreRepository.save(new Chambre("single room", 43, "Extremely clean",5, h1));
		 Chambre c2=chambreRepository.save(new Chambre("double room", 100, "Very confortable",5, h1));
		 Chambre c3=chambreRepository.save(new Chambre("multiple room", 250, "Excelent",5, h1));
		 
		 Chambre c5=chambreRepository.save(new Chambre("single room", 76, "Extremely clean",6,  h2));
		 Chambre c6=chambreRepository.save(new Chambre("double room", 200, "Very good",7, h2));
		 Chambre c7=chambreRepository.save(new Chambre("multiple room", 280, "Good choice for families" ,6, h2));
		 

		 Chambre c8=chambreRepository.save(new Chambre("single room", 98, "Extremely clean",4,  h3));
		 Chambre c10=chambreRepository.save(new Chambre("double room", 195, "Very good",3, h3));
		 Chambre c11=chambreRepository.save(new Chambre("multiple room", 300, "Good choice for families" ,1, h3));
		 
		 Chambre c12=chambreRepository.save(new Chambre("single room", 34, "Extremely clean", 6, h4));
		 Chambre c13=chambreRepository.save(new Chambre("double room", 100, "Very good", 7, h4));
		 Chambre c14=chambreRepository.save(new Chambre("multiple room", 200, "Good choice for families" ,2, h4));
		 
		 Chambre c15=chambreRepository.save(new Chambre("single room", 46, "Extremely clean",4,  h5));
		 Chambre c16=chambreRepository.save(new Chambre("double room", 120, "Very good",5, h5));
		 Chambre c17=chambreRepository.save(new Chambre("multiple room", 210, "Good choice for families" ,8,h5));
		 
		 Chambre c18=chambreRepository.save(new Chambre("single room", 32, "Extremely clean", 4, h6));
		 Chambre c19=chambreRepository.save(new Chambre("double room", 90, "Very good",5, h6));
		 Chambre c20=chambreRepository.save(new Chambre("multiple room", 150, "Good choice for families" ,6, h6));
		 
		 Chambre c21=chambreRepository.save(new Chambre("single room", 58, "Extremely clean",10,  h7));
		 Chambre c22=chambreRepository.save(new Chambre("double room", 117, "Very good",5, h7));
		 Chambre c23=chambreRepository.save(new Chambre("multiple room", 250, "Good choice for families" ,5, h7));
		 
		 Chambre c24=chambreRepository.save(new Chambre("single room", 44, "Extremely clean",9,  h8));
		 Chambre c25=chambreRepository.save(new Chambre("double room", 90, "Very good",7, h8));
		 Chambre c26=chambreRepository.save(new Chambre("multiple room", 170, "Good choice for families" ,4, h8));
		 
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("11/5/2020"), simpleDateFormat.parse("12/5/2020"), c2));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("12/5/2020"), simpleDateFormat.parse("14/5/2020"), c7));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("19/5/2020"), simpleDateFormat.parse("20/5/2020"), c11));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("25/5/2020"), simpleDateFormat.parse("26/5/2020"), c14));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("11/5/2020"), simpleDateFormat.parse("13/5/2020"), c17));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("21/5/2020"), simpleDateFormat.parse("22/5/2020"), c20));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("18/5/2020"), simpleDateFormat.parse("19/5/2020"), c21));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("29/5/2020"), simpleDateFormat.parse("30/5/2020"), c26));
		 /********************/
		 
		 /**DAKHLA***********/
		 /*
		 Hotel h10=hotelRepository.save(new Hotel("La Crique", "DAKHLA", "3.4 km to City centre","7" ,"Good", "14", "E:\\Gestion_hotels\\dakhla\\La Crique"));
		 Hotel h11=hotelRepository.save(new Hotel("Buena Vista", "DAKHLA", "1.5 km to City centre","8" ,"Very Good", "15", "E:\\Gestion_hotels\\dakhla\\Buena Vista"));
		 Hotel h12=hotelRepository.save(new Hotel("Hotel Calipau Sahara Dakhla", "DAKHLA", "11.2 km to City centre","7", "Good", "34", "E:\\Gestion_hotels\\dakhla\\Calipau Sahara Dakhla"));
		 Hotel h13=hotelRepository.save(new Hotel("Dakhla Club", "DAKHLA", "26.1 km to City centre","8" ,"Excellent", "36", "E:\\Gestion_hotels\\dakhla\\Dakhla Club"));
		 Hotel h14=hotelRepository.save(new Hotel("Dakhlacamp", "DAKHLA", "27.3 km to City centre","8", "Very good", "20", "E:\\Gestion_hotels\\dakhla\\Dakhlacamp"));
		 Hotel h15=hotelRepository.save(new Hotel("Dakhla Sur Mer", "DAKHLA", "2.6 km to City centre","7", "Good" ,"14", "E:\\Gestion_hotels\\dakhla\\Dakhla Sur Mer"));
		 Hotel h16=hotelRepository.save(new Hotel("Residence Tamaya", "DAKHLA", "3.2 km to City centre","8" ,"Very good", "21", "E:\\Gestion_hotels\\dakhla\\Residence Tamaya"));
		 Hotel h17=hotelRepository.save(new Hotel("Dar Rio Oro", "DAKHLA", "1.8 km to City centre","8", "Excellent", "162", "E:\\Gestion_hotels\\dakhla\\Dar Rio Oro"));
		 Hotel h18=hotelRepository.save(new Hotel("West Point", "DAKHLA", "5.5 km to City centre","8" ,"Very good" ,"23", "E:\\Gestion_hotels\\dakhla\\West Point"));
		 Hotel h19=hotelRepository.save(new Hotel("Palais des Touaregs", "DAKHLA", "1.4 km to City centre","7", "/" ,"10", "E:\\Gestion_hotels\\dakhla\\Palais des Touaregs"));
		 
		 Chambre c27=chambreRepository.save(new Chambre("single room", 98, "Awesome decoration",7, h10));
		 Chambre c28=chambreRepository.save(new Chambre("double room", 194, "Clean",8, h10));
		 Chambre c29=chambreRepository.save(new Chambre("multiple room", 375, "Very confortable",4, h10));
		 
		 Chambre c30=chambreRepository.save(new Chambre("single room", 91, "Beautiful vue",7, h11));
		 Chambre c31=chambreRepository.save(new Chambre("double room", 190, "Good",6, h11));
		 Chambre c33=chambreRepository.save(new Chambre("multiple room", 400, "Amazing room",4, h11));
		 
		 Chambre c34=chambreRepository.save(new Chambre("single room", 195, "Beautiful vue",7, h12));
		 Chambre c35=chambreRepository.save(new Chambre("double room", 240, "Good",6, h12));
		 Chambre c36=chambreRepository.save(new Chambre("multiple room", 300, "Amazing room",5, h12));
		 
		 Chambre c37=chambreRepository.save(new Chambre("single room", 195, "Beautiful vue",3, h13));
		 Chambre c38=chambreRepository.save(new Chambre("double room", 250, "Good",4, h13));
		 Chambre c39=chambreRepository.save(new Chambre("multiple room", 380, "Amazing room",6, h13));
		 
		 Chambre c40=chambreRepository.save(new Chambre("single room", 146, "Beautiful vue",10, h14));
		 Chambre c41=chambreRepository.save(new Chambre("double room", 163, "Good",4, h14));
		 Chambre c42=chambreRepository.save(new Chambre("multiple room", 260, "Amazing room",3, h14));
		 
		 Chambre c43=chambreRepository.save(new Chambre("single room", 76, "Beautiful vue",4, h15));
		 Chambre c44=chambreRepository.save(new Chambre("double room", 80, "Good",5, h15));
		 Chambre c45=chambreRepository.save(new Chambre("multiple room", 260, "Amazing room",2, h15));
		 
		 Chambre c46=chambreRepository.save(new Chambre("single room", 54, "Beautiful vue",9, h16));
		 Chambre c47=chambreRepository.save(new Chambre("double room", 100, "Good",4, h16));
		 Chambre c48=chambreRepository.save(new Chambre("multiple room", 120, "Amazing room",8, h16));
		 
		 Chambre c49=chambreRepository.save(new Chambre("single room", 48, "Beautiful vue",9, h17));
		 Chambre c50=chambreRepository.save(new Chambre("double room", 90, "Good",12, h17));
		 Chambre c51=chambreRepository.save(new Chambre("multiple room", 130, "Amazing room",7, h17));
		 
		 Chambre c52=chambreRepository.save(new Chambre("single room", 182, "Beautiful vue",9, h18));
		 Chambre c53=chambreRepository.save(new Chambre("double room", 200, "Good",4, h18));
		 Chambre c54=chambreRepository.save(new Chambre("multiple room", 230, "Amazing room",9, h18));
		 
		 Chambre c55=chambreRepository.save(new Chambre("single room", 54, "Beautiful vue",9, h19));
		 Chambre c56=chambreRepository.save(new Chambre("double room", 90, "Good",12, h19));
		 Chambre c57=chambreRepository.save(new Chambre("multiple room", 210, "Amazing room",6, h19));
		 
		 

		 reservationRepository.save(new Reservation(simpleDateFormat.parse("11/5/2020"), simpleDateFormat.parse("12/5/2020"), c27));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("12/5/2020"), simpleDateFormat.parse("13/5/2020"), c31));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("16/5/2020"), simpleDateFormat.parse("18/5/2020"), c33));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("18/5/2020"), simpleDateFormat.parse("19/5/2020"), c36));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("22/5/2020"), simpleDateFormat.parse("23/5/2020"), c37));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("24/5/2020"), simpleDateFormat.parse("27/5/2020"), c40));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("25/5/2020"), simpleDateFormat.parse("28/5/2020"), c44));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("24/5/2020"), simpleDateFormat.parse("25/5/2020"), c46));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("13/5/2020"), simpleDateFormat.parse("16/5/2020"), c49));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("30/5/2020"), simpleDateFormat.parse("1/6/2020"), c53));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("14/5/2020"), simpleDateFormat.parse("18/5/2020"), c55));
		 /*******************/
	 
		 /******TANGER***********/
		 /*
		 Hotel h20=hotelRepository.save(new Hotel("ibis Tanger City Center", "TANGER", "2.1 km to Tanger Med Port","7","/", "601", "E:\\Gestion_hotels\\tanger\\ibis Tanger City Center"));
		 Hotel h21=hotelRepository.save(new Hotel("Hotel Atlas Rif & Spa", "TANGER", "3.8 km to Tanger Med Port","7","Good","767", "E:\\Gestion_hotels\\tanger\\Hotel Atlas Rif & Spa"));
		 Hotel h22=hotelRepository.save(new Hotel("Continental", "TANGER", "0.3 km to Tanger Med Port","7","/", "1636", "E:\\Gestion_hotels\\tanger\\Continental"));
		 Hotel h23=hotelRepository.save(new Hotel("Fredj Hotel", "TANGER", "0.6 km to Tanger Med Port","6","/", "15", "E:\\Gestion_hotels\\tanger\\Fredj Hotel"));
		 Hotel h24=hotelRepository.save(new Hotel("Etoile Du Nord", "TANGER", "1.6 km to Tanger Med Port","7", "Good", "11", "E:\\Gestion_hotels\\tanger\\Etoile Du Nord"));
		 Hotel h25=hotelRepository.save(new Hotel("Riad Mokhtar", "TANGER", "0.8 km to Tanger Med Port","8", "Very good" ,"27", "E:\\Gestion_hotels\\tanger\\Riad Mokhtar"));
		 Hotel h26=hotelRepository.save(new Hotel("Kenzi Solazur", "TANGER", "1.3 km to Tanger Med Port","7" ,"Good" ,"2384", "E:\\Gestion_hotels\\tanger\\Kenzi Solazur"));
		 Hotel h27=hotelRepository.save(new Hotel("El Minzah Hotel", "TANGER", "0.6 km to Tanger Med Port","8","Very good", "1029", "E:\\Gestion_hotels\\tanger\\El Minzah Hotel"));
		 
		 Chambre c58=chambreRepository.save(new Chambre("single room", 52, "clean",5, h20));
		 Chambre c59=chambreRepository.save(new Chambre("double room", 150, "nice",8, h20));
		 Chambre c60=chambreRepository.save(new Chambre("multiple room", 350, "confortable",6, h20));
		 
		 Chambre c61=chambreRepository.save(new Chambre("single room", 144,"good",7, h21));
		 Chambre c62=chambreRepository.save(new Chambre("double room", 149, "clean",4, h21));
		 Chambre c63=chambreRepository.save(new Chambre("multiple room", 154, "suitable for big family",7, h21));
		 
		 Chambre c64=chambreRepository.save(new Chambre("single room", 41,"good",8, h22));
		 Chambre c65=chambreRepository.save(new Chambre("double room", 90, "clean",6, h22));
		 Chambre c66=chambreRepository.save(new Chambre("multiple room", 200, "suitable for big family",9, h22));
		 
		 Chambre c67=chambreRepository.save(new Chambre("single room", 71,"good",10, h23));
		 Chambre c68=chambreRepository.save(new Chambre("double room", 140, "clean",5, h23));
		 Chambre c69=chambreRepository.save(new Chambre("multiple room", 240, "suitable for big family",7, h23));
		 
		 Chambre c70=chambreRepository.save(new Chambre("single room", 43,"good",8, h24));
		 Chambre c71=chambreRepository.save(new Chambre("double room", 96, "clean",6, h24));
		 Chambre c72=chambreRepository.save(new Chambre("multiple room", 200, "suitable for big family",4, h24));
		 
		 Chambre c73=chambreRepository.save(new Chambre("single room", 121,"good",8, h25));
		 Chambre c74=chambreRepository.save(new Chambre("double room", 150, "clean",6, h25));
		 Chambre c75=chambreRepository.save(new Chambre("multiple room", 260, "suitable for big family",5, h25));
		 
		 Chambre c76=chambreRepository.save(new Chambre("single room", 61,"good",4, h26));
		 Chambre c77=chambreRepository.save(new Chambre("double room", 120, "clean",9, h26));
		 Chambre c78=chambreRepository.save(new Chambre("multiple room", 242, "suitable for big family",5, h26));
		 
		 Chambre c79=chambreRepository.save(new Chambre("single room", 148,"good",10, h27));
		 Chambre c80=chambreRepository.save(new Chambre("double room", 220, "clean",12, h27));
		 Chambre c81=chambreRepository.save(new Chambre("multiple room", 300, "suitable for big family",3, h27));
		 


		 reservationRepository.save(new Reservation(simpleDateFormat.parse("11/5/2020"), simpleDateFormat.parse("12/5/2020"), c59));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("15/5/2020"), simpleDateFormat.parse("17/5/2020"), c62));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("14/5/2020"), simpleDateFormat.parse("19/5/2020"), c66));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("12/5/2020"), simpleDateFormat.parse("16/5/2020"), c68));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("13/5/2020"), simpleDateFormat.parse("14/5/2020"), c71));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("14/5/2020"), simpleDateFormat.parse("17/5/2020"), c75));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("18/5/2020"), simpleDateFormat.parse("20/5/2020"), c77));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("15/5/2020"), simpleDateFormat.parse("18/5/2020"), c80));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("17/5/2020"), simpleDateFormat.parse("20/5/2020"), c81));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("20/5/2020"), simpleDateFormat.parse("21/5/2020"), c53));
		 reservationRepository.save(new Reservation(simpleDateFormat.parse("22/5/2020"), simpleDateFormat.parse("26/5/2020"), c55));
		 
		 /*******************/
	 
	 }
	

}
