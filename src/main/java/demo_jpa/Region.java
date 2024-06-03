package demo_jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * création de la table Region
 */
@Entity
@Table(name="Region")
public class Region {
	@Id
	private int id;
	@Column(name="nom", length = 30, nullable = false)
	private String nom;
	

	/** Constructeur
	 * 
	 */
	public Region() {
		
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
	/** Getter pour nom
	 * @return the nom 
	*/
	public String getNom() {
		return nom;
	}
	/** Setter pour nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
