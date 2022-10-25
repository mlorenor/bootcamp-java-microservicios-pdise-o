package com.nttdata.bootcamp.paterns.builder.builders;

import com.nttdata.bootcamp.paterns.builder.casas.CasaType;
import com.nttdata.bootcamp.paterns.builder.componentes.Cocina;

public interface Builder {
	void setCasaType(CasaType type);
	void setBaños(int n_baños);
	void setHabitaciones(int n_habitaciones);
	void setCocina(Cocina cocina);

}
