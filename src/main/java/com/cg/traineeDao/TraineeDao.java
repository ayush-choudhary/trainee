package com.cg.traineeDao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.cg.traineeBean.Trainee;

public class TraineeDao {
	

	 @PersistenceContext
	    EntityManager em;
				
	 
	 
	 
	 // Code for adding in database
	 		@Transactional
		  public void save(Trainee tr) {
			  
			  em.persist(tr);
			  
		  }
	 		
	//code for deleting in database
	 		@Transactional
	 		public void delete(int id) {
	 			Trainee tr=em.find(Trainee.class,id);
	 			em.remove(tr);
	 		}
	 		
	 //code for finding in database
	 		@Transactional
	 		public Trainee findTrainee(int id) {
	 			return em.find(Trainee.class,id);
	 			
	 		}
		  
	
	//code for retrieving all values from database	
	 		@Transactional
	public List<Trainee> findAllTrainees() {
		 List<Trainee> results = em.createQuery("Select t from Trainee t",Trainee.class).getResultList();
		
		 return results;
			}
	
}
