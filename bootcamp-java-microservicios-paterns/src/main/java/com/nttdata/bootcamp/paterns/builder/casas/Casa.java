package com.nttdata.bootcamp.paterns.builder.casas;

import com.nttdata.bootcamp.paterns.builder.componentes.Cocina;

public class Casa {
	private CasaType type;
	private int n_baños;
	private int n_habitaciones;
	private Cocina cocina;
	
	public Casa() {
		
	}
	
	public Casa(CasaType type, int n_baños, int n_habitaciones, Cocina cocina) {
		this.type = type;
		this.n_baños = n_baños;
		this.n_habitaciones = n_habitaciones;
		this.cocina = cocina;
	}

	public CasaType getType() {
		return type;
	}

	public void setType(CasaType type) {
		this.type = type;
	}

	public int getN_baños() {
		return n_baños;
	}

	public void setN_baños(int n_baños) {
		this.n_baños = n_baños;
	}

	public int getN_habitaciones() {
		return n_habitaciones;
	}

	public void setN_habitaciones(int n_habitaciones) {
		this.n_habitaciones = n_habitaciones;
	}

	public Cocina getCocina() {
		return cocina;
	}

	public void setCocina(Cocina cocina) {
		this.cocina = cocina;
	}

	@Override
	public String toString() {
		return "Casa [type=" + type + ", n_baños=" + n_baños + ", n_habitaciones=" + n_habitaciones + ", cocina="
				+ cocina + "]";
	}
	
	
	
	
}
