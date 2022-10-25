package com.nttdata.bootcamp.paterns.builder.componentes;

public class Cocina {
	private double metrosCuadrados;
	private boolean abierta;
	
	public Cocina(double metrosCuadrados, boolean abierta) {
		this.metrosCuadrados = metrosCuadrados;
		this.abierta = abierta;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public boolean isAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	
	
	
	
}
