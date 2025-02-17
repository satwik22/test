/* 
 * Author ::. Sivateja Kandula | www.java4s.com 
 *
 */

package com.java4s.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootApp {
	public static void main(String[] args) {

		 SpringApplication.run(SpringBootApp.class, args);

	}
}