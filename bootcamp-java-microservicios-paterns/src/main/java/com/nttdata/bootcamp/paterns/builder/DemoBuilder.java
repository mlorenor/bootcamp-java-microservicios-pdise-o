package com.nttdata.bootcamp.paterns.builder;

import com.nttdata.bootcamp.paterns.builder.builders.CasaBuilder;
import com.nttdata.bootcamp.paterns.builder.casas.Casa;
import com.nttdata.bootcamp.paterns.builder.director.Director;

public class DemoBuilder {

	public static void main (String [] args) {
		Director director = new Director();
		
		CasaBuilder builder = new CasaBuilder();
		
		director.construirApartamento(builder);
		
		Casa casa = builder.getResult();
		System.out.println("Casa construida: "+casa.getType());
		
		
	}
}
