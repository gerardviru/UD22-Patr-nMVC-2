package Modelo;

import java.sql.Date;

public class Cliente {

	private Long ID;
	private String Nombre;
	private String Apellido;
	private String Dirección;
	private String DNI;
	private Date Fecha;
	
	public Cliente() {
		
	}

	public Cliente(Long iD, String nombre, String apellido, String dirección, String dNI, Date fecha) {
		
		ID = iD;
		Nombre = nombre;
		Apellido = apellido;
		Dirección = dirección;
		DNI = dNI;
		Fecha = fecha;
	}
	
	//Getters & Setters

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDirección() {
		return Dirección;
	}

	public void setDirección(String dirección) {
		Dirección = dirección;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	@Override
	public String toString() {
		return "Cliente [ID=" + ID + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Dirección=" + Dirección
				+ ", DNI=" + DNI + ", Fecha=" + Fecha + "]";
	}
	
}
