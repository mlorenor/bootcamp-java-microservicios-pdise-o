package com.nttdata.bootcamp.paterns.builder.builders;

import com.nttdata.bootcamp.paterns.builder.casas.Casa;
import com.nttdata.bootcamp.paterns.builder.casas.CasaType;
import com.nttdata.bootcamp.paterns.builder.componentes.Cocina;

public class CasaBuilder implements Builder {
	private CasaType type;
	private int n_baños;
	private int n_habitaciones;
	private Cocina cocina;

	@Override
	public void setCasaType(CasaType type) {
		this.type=type;
		
	}

	@Override
	public void setBaños(int n_baños) {
		this.n_baños=n_baños;
		
	}

	@Override
	public void setHabitaciones(int n_habitaciones) {
		this.n_habitaciones=n_habitaciones;
		
	}

	@Override
	public void setCocina(Cocina cocina) {
		this.cocina=cocina;
		
	}
	
	public Casa getResult() {
		return new Casa(type, n_baños, n_habitaciones, cocina);
	}

}
