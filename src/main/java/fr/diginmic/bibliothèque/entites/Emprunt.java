package fr.diginmic.bibliothèque.entites;

import java.sql.Date;
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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * 
 */
@Entity
@Table(name = "EMMPRUNT")
public class Emprunt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", length = 10)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@Column(name = "delais", length = 10)
	private int delais;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Emprunt emprunt;
	
	@ManyToMany
	@JoinTable(name="COMPO",
			joinColumns = @JoinColumn(name="ID_CLIENT", referencedColumnName = "ID"),
			inverseJoinColumns= @JoinColumn(name="ID_EMPRUNT", referencedColumnName = "ID")
			)
	private List<Client> clients;
	
	/** Constructeur
	 * 
	 */
	public Emprunt() {
		
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

	/** Getter pour dateDebut
	 * @return the dateDebut 
	*/
	public Date getDateDebut() {
		return dateDebut;
	}

	/** Setter pour dateDebut
	 * @param dateDebut
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter pour dateFin
	 * @return the dateFin 
	*/
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter pour dateFin
	 * @param dateFin
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/** Getter pour delais
	 * @return the delais 
	*/
	public int getDelais() {
		return delais;
	}

	/** Setter pour delais
	 * @param delais
	 */
	public void setDelais(int delais) {
		this.delais = delais;
	}

	@Override
	public String toString() {
		return "Emprunt [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", delais=" + delais + "]";
	}

	/** Getter pour emprunt
	 * @return the emprunt 
	*/
	public Emprunt getEmprunt() {
		return emprunt;
	}

	/** Setter pour emprunt
	 * @param emprunt
	 */
	public void setEmprunt(Emprunt emprunt) {
		this.emprunt = emprunt;
	}

	/** Getter pour clients
	 * @return the clients 
	*/
	public List<Client> getClients() {
		return clients;
	}

	/** Setter pour clients
	 * @param clients
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
}
