package fr.diginmic.bibliothèque.entites;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;


/**
 * 
 */
@Entity
public class Client {

	@Id
	@Column(name="ID", length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom", length = 50, nullable = false)
	private String nom;
	
	@Column(name="prenom", length = 50, nullable = false)
	private String prenom;
	@OneToMany(mappedBy = "emprunt")
	private List<Client> clients = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "COMPO",
			joinColumns = @JoinColumn(name="ID_EMPRUNT", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name="ID_CLIENT", referencedColumnName = "ID")
			)
	private List<Client> emprunt = new ArrayList<>();
	private Client() {
		
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

	/** Getter pour prenom
	 * @return the prenom 
	*/
	public String getPrenom() {
		return prenom;
	}

	/** Setter pour prenom
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter pour clents
	 * @return the clents 
	*/
	public List<Client> getClents() {
		return clents;
	}

	/** Setter pour clents
	 * @param clents
	 */
	public void setClents(List<Client> clents) {
		this.clents = clents;
	}

	/** Getter pour emprunt
	 * @return the emprunt 
	*/
	public List<Client> getEmprunt() {
		return emprunt;
	}

	/** Setter pour emprunt
	 * @param emprunt
	 */
	public void setEmprunt(List<Client> emprunt) {
		this.emprunt = emprunt;
	}
}
