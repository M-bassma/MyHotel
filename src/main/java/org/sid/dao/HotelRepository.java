package org.sid.dao;

import java.util.List;

import org.sid.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
	@Query("select h from Hotel h where h.ville=:x ")
    public List<Hotel> listHotelVille(@Param("x")String ville);
	
	@Query("select h from Hotel h where h.libelle=:x ")
    public Hotel getHotel(@Param("x")String libelle);
}
