package com.nttdata.bootcamp.paterns;

import java.util.Iterator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.paterns.singleton.PersonSingleton;

@SpringBootApplication
public class BootcampJavaMicroserviciosPaternsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootcampJavaMicroserviciosPaternsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        PersonSingleton person = PersonSingleton.getInstance("Nombre 1",23);
        PersonSingleton anotherPerson = PersonSingleton.getInstance("Nombre 2",35);
        
        person.singleOperation();
        anotherPerson.singleOperation();
		
		
	}
	

}
