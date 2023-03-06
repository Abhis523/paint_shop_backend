package com.project.paintshop.morya.dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.project.paintshop.morya.model.Counter;
import com.project.paintshop.morya.model.CustomerInfo;

@Repository
public class CustomerDao {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Collection<CustomerInfo> getAllCustomers(){
		
		try {
			
			return entityManager.createQuery("From CustomerInfo", CustomerInfo.class).getResultList();
			
		} catch(Exception e) {
			
			throw new RuntimeException(e);
		}
	}
	
	public void registerCustomer(CustomerInfo customerInfo){
			try {
				Counter ctr = entityManager.find(Counter.class, "customer");
				Counter ct = entityManager.find(Counter.class, "customerAddress");
				
				
				        String abc = "CU" + ctr.nextValue();
				        String cba = "CA" + ct.nextValue();
				        
				        customerInfo.setCustId(abc);
				        customerInfo.setUserName(customerInfo.getUserName());
				        customerInfo.setFirstName(customerInfo.getFirstName());
				        customerInfo.setLastName(customerInfo.getLastName());
				        customerInfo.setPassword(customerInfo.getPassword());
				        customerInfo.setCustEmail(customerInfo.getCustEmail());
				        customerInfo.setCustContact(customerInfo.getCustContact());
				        customerInfo.setAdId(cba);
				        customerInfo.setAddress(customerInfo.getAddress());
				        customerInfo.setCity(customerInfo.getCity());
				        customerInfo.setState(customerInfo.getState());
				        customerInfo.setCountry(customerInfo.getCountry());
//				    	address VARCHAR2(50) NOT NULL,
//				    	city VARCHAR2(50) NOT NULL,
//				    	state VARCHAR2(50) NOT NULL,
//				    	country VARCHAR2(50) NOT NULL,
						
			entityManager.persist(customerInfo);
		}
		catch (Exception e) 
		{
			throw new RuntimeException(e);
		}
	}
	
	
	public Collection<CustomerInfo> loginCustomer(CustomerInfo customerInfo)
	{
		//List<Customer> customer
		try {
			 
			 TypedQuery<CustomerInfo> query = entityManager.createQuery("SELECT x FROM CustomerInfo x  WHERE x.custEmail = :mail AND x.password = :pass", CustomerInfo.class);

			 		String mail =  customerInfo.getCustEmail();
			 		String password = customerInfo.getPassword();
			 		
			 		//System.out.printf("%s\t%s", mail, password);			 
			 
			 		/*
				  	ArrayList<Customer> cust1 = new ArrayList<Customer>(); cust1.add(new
				  	Customer("Demo", "Demo", "Demo", "Demo", "Demo", "Demo"));
			 		 */
			 
			 		List<CustomerInfo> customer =  query
			 				.setParameter("mail" , mail)
			 				.setParameter("pass", password)
			 				.getResultList();
			 		
			 		
			 		/*
			 		//System.out.println("List"+cust1.get(0));
			 
					boolean ans =customer.contains(mail);
					if(ans)
					{
			  			System.out.println(customer);				
			  		}else 
			  			{
				  			System.out.println("ffdfd");  
			  			}
			  		}
					if(customer.isEmpty())
					{
						a = 0;
						System.out.println("InValid user");
					}else
					{
						a=1;
				
					}
			 		 */
			
			System.out.println(customer);
			/*
			 * for(Customer res : customer) { String a = res.getCustId();
			 * 
			 * if(a == null) { System.out.println("Customer does not exit"); }else {
			 * System.out.printf("Res:%s\t %s \t %s  \t %s \t %n", res.getCustId(),
			 * res.getFirstname(),res.getLastname(), res.getPassword() ); } //}
			 */			 
			
			return customer;
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
		 
	}
}
