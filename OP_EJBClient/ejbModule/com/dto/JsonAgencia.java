package com.dto;

import java.io.Serializable;

public class JsonAgencia implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipo;
	private String detalle;
	
	
	
	public JsonAgencia(String tipo, String detalle) {
		super();
		this.tipo = tipo;
		this.detalle = detalle;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	


}
