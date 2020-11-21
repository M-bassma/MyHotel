package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hotel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4562092935478820652L;
	@Id @GeneratedValue
	private Integer id_hotel;
	private String libelle;
	private String ville;
	private String distance;
	private String rating;
	private String viewers;
	private String goodness;
	private String images;
	@OneToMany(mappedBy = "hotel")
	private Collection<Chambre> chambres;
	
	public Hotel(String libelle, String ville, String distance, String rating, String goodness, String viewers, String images) {
		super();
		this.libelle = libelle;
		this.ville = ville;
		this.distance = distance;
		this.rating=rating;
		this.viewers=viewers;
		this.goodness=goodness;
		this.images = images;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId_hotel() {
		return id_hotel;
	}
	public void setId_hotel(Integer id_hotel) {
		this.id_hotel = id_hotel;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public Collection<Chambre> getChambres() {
		return chambres;
	}
	public void setChambres(Collection<Chambre> chambres) {
		this.chambres = chambres;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getViewers() {
		return viewers;
	}
	public void setViewers(String viewers) {
		this.viewers = viewers;
	}
	public String getGoodness() {
		return goodness;
	}
	public void setGoodness(String goodness) {
		this.goodness = goodness;
	}
	public Integer getPrix(String type,Integer number) {
		Integer prix=Integer.MAX_VALUE;
		if(type.equals("") && number==0) {
			for (Chambre chambre : chambres) {
				if(chambre.getPrix()<=prix) {
					prix=chambre.getPrix();
				}
			}
		}
		else {
			prix=0;
			if(!(type.equals("")) && number!=0) {
				for (Chambre chambre : chambres) {
					if(chambre.getType().equals(type)) {
						if((chambre.getNbChambres()>chambre.getReservations().size()) && (chambre.getNbChambres()-chambre.getReservations().size() >= number) ) {
							prix=chambre.getPrix();
						}
						else {
							prix=-1;
						}
					}
				}
			}
		}
		return prix;
	}
}
