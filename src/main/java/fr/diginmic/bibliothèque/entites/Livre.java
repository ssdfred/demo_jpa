package fr.diginmic.bibliothèque.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * 
 */
@Entity
public class Livre {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="titre", length = 255, nullable = false)
	private String titre;
	
	@Column(name="nom", length = 50, nullable = false)
	private String auteur;
	
	

	/** Constructeur
	 * 
	 */
	public Livre() {
		
	}

	/** Getter pour id
	 * @return the id 
	*/
	public int getId() {
		return id;
	}

	/** Setter pour id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/** Getter pour titre
	 * @return the titre 
	*/
	public String getTitre() {
		return titre;
	}

	/** Setter pour titre
	 * @param titre
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/** Getter pour auteur
	 * @return the auteur 
	*/
	public String getAuteur() {
		return auteur;
	}

	/** Setter pour auteur
	 * @param auteur
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + "]";
	}
	
	
	
}
