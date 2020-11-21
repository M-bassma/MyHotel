package org.sid.dao;


import org.sid.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre ,Integer> {
	
}
