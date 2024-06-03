package fr.diginmic;

import java.util.List;

import fr.diginmic.entites.Region;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * 
 */
public class ConnexionJpa {

	/**
	 * Création des insertion et select sur la table Region
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		Region occitanie = new Region();
		occitanie.setNom("Occitanie");
		em.persist(occitanie);
		Region centre = new Region();

		centre.setNom("Centre");
		em.persist(centre);
		Region nord = new Region();

		nord.setNom("Nord");
		em.persist(nord);
		Region nouvelleAquitaine = new Region();
		nouvelleAquitaine.setNom("nouvelle-aquitaine");
		em.persist(nouvelleAquitaine);
		
		transaction.commit();
		
		//Récuperer la list des regions en Base de données
		TypedQuery<Region> query =em.createQuery("select r from Region r", Region.class);
		List<Region> listRegions = query.getResultList();
		for (Region region: listRegions) {
			System.out.println(region);
		}

		//Fermeture des ressources
;		em.close();

	}

}
