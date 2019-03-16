/* 
 * Author ::. Sivateja Kandula | www.java4s.com 
 *
 */

package com.java4s.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java4s.model.Customer;

@RestController
public class SpringJava4sController {

	@RequestMapping("/get-cust-info")
	@Cacheable(value="cacheCustInfo")
	public List<Customer> customerInformation() {
		
		System.out.println("I am from customerInformation");
		
		List<Customer> custDetails =  Arrays.asList(
				
				/* 
				 * Here you can add your database logic/flow to get the customer details 
				 * For time being I am hard coding 2 values 
				 */
					
				 new Customer(100,"Bank Of America","USA"),
				 new Customer(101,"Bank Of India","India")
		    );
		    
		return custDetails;
	}
}

// http://localhost:8080/springbootcache/get-cust-info