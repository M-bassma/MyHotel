package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Reservation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Integer id_reservation;
	private Date debut;
	private Date fin;
	@ManyToOne
	@JoinColumn(name = "CODE_CHAMBRE")
	private Chambre chambre;
	public Reservation(Date debut, Date fin, Chambre chambre) {
		super();
		this.debut = debut;
		this.fin = fin;
		this.chambre = chambre;
	}
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId_reservation() {
		return id_reservation;
	}
	public void setId_reservation(Integer id_reservation) {
		this.id_reservation = id_reservation;
	}
	public Date getDebut() {
		return debut;
	}
	public void setDebut(Date debut) {
		this.debut = debut;
	}
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
	}
	public Chambre getChambre() {
		return chambre;
	}
	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
	
}
