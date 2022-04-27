package it.fullstackacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;



	@Component
	public class MyApplicationRunner implements CommandLineRunner {
		
		@Override
		public void run(String...args) {
			System.out.println("Sono nel runner!");
			
		}
		
	}

