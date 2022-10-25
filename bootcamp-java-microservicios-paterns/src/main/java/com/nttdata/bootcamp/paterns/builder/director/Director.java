package com.nttdata.bootcamp.paterns.builder.director;

import com.nttdata.bootcamp.paterns.builder.builders.Builder;
import com.nttdata.bootcamp.paterns.builder.casas.CasaType;
import com.nttdata.bootcamp.paterns.builder.componentes.Cocina;

public class Director {

	public void construirCasaAdosada(Builder builder) {
		builder.setCasaType(CasaType.ADOSADO);
		builder.setBaños(2);
		builder.setHabitaciones(3);
		builder.setCocina(new Cocina(20, false));
		
	}
	
	public void construirApartamento(Builder builder) {
		builder.setCasaType(CasaType.APARTAMENTO);
		builder.setBaños(1);
		builder.setHabitaciones(2);
		builder.setCocina(new Cocina(10, true));
		
	}
	
	public void construirChalet(Builder builder) {
		builder.setCasaType(CasaType.CHALET);
		builder.setBaños(3);
		builder.setHabitaciones(4);
		builder.setCocina(new Cocina(30, true));
		
	}
}
