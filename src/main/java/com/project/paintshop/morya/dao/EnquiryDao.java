//package com.project.paintshop.morya.dao;
//
//import java.util.Collection;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.project.paintshop.morya.model.Counter;
//import com.project.paintshop.morya.model.Enquiry;
//
//@Repository
//public class EnquiryDao {
//
//	@PersistenceContext
//	EntityManager entityManager;
//	
//	public Collection<Enquiry> getAllEnquiry()
//	{
//		try 
//		{
//			return entityManager.createQuery("FROM Enquiry",Enquiry.class).getResultList();
//		}
//		catch(Exception e)
//		{
//			throw new RuntimeException(e);
//		}
//	}
//	
//	@Transactional(rollbackFor=Exception.class, timeout=5, propagation=Propagation.REQUIRED)
//	public void saveEnquiry(Enquiry enquiry)
//	{
//		try {
//			
//			Counter ctr = entityManager.find(Counter.class, "equiry");
//			
//			        String abc = "ENQ" + ctr.nextValue();
//			        
////			    	private String enqId;
////			    	private String name;
////			    	private String email;
////			    	private Integer mobNo;
////			    	private String aboutProducts;
////			    	private String help;
//			    	
//			    	
//			        enquiry.setEnqId(abc);
//			        enquiry.setName(enquiry.getName());
////			        enquiry.setEmail(enquiry.getEmail());
//			        enquiry.setMobNo(enquiry.getMobNo());
//			        enquiry.setAboutProducts(enquiry.getAboutProducts());
//			        enquiry.setHelp(enquiry.getHelp());
//
//			entityManager.persist(enquiry);
//			
//		}
//		catch(Exception e)
//		{
//			throw new RuntimeException(e);
//		}
//	}
//
//}
