package fr.diginmic;

import java.util.List;

import demo_jpa.Region;
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
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
	
		transaction.begin();
		
		Region occitanie = new Region();
		occitanie.setId(1);
		occitanie.setNom("Occitanie");
		em.persist(occitanie);
		Region centre = new Region();
		centre.setId(2);
		centre.setNom("Centre");
		em.persist(centre);
		Region nord = new Region();
		nord.setId(3);
		nord.setNom("Nord");
		em.persist(nord);
		Region nouvelleAquitaine = new Region();
		nouvelleAquitaine.setId(4);
		nouvelleAquitaine.setNom("nouvelle-aquitaine");
		em.persist(nouvelleAquitaine);


		
		
	}

}
