package demo_jpa;

/**
 * création de la table Region
 */
public class Region {
	private int id;
	private String nom;
	
	
	public Region() {
		
	}
	Region r1 = new Region();
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
