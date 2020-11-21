package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Chambre implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Integer id_chambre;
	private String type;
	private Integer prix;
	private String etat;
	private int nbChambres;
	@ManyToOne
	@JoinColumn(name = "CODE_HOTEL")
	private Hotel hotel;
	@OneToMany(mappedBy = "chambre")
	private Collection<Reservation> reservations;
	
	public Chambre(String type, Integer prix, String etat,int nbChambres, Hotel hotel) {
		super();
		this.type = type;
		this.prix = prix;
		this.etat = etat;
		this.nbChambres=nbChambres;
		this.hotel = hotel;
	}
	public Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId_chambre() {
		return id_chambre;
	}
	public void setId_chambre(Integer id_chambre) {
		this.id_chambre = id_chambre;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getPrix() {
		return prix;
	}
	public void setPrix(Integer prix) {
		this.prix = prix;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public int getNbChambres() {
		return nbChambres;
	}
	public void setNbChambres(int nbChambres) {
		this.nbChambres = nbChambres;
	}
	public Collection<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}
}
