package org.islasfilipinas;

import java.util.Objects;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int edad;
	private int telefono;
	private String mail;
	private int expnum;
	private String dni;
	private String fNac;
	private int nota;
	
	public Alumno() {
		//super();
	}
	
	public Alumno(String nombre, String apellido, int edad) {
		//super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	public Alumno(int telefono, String mail, int expnum, String dni, String fNac, int nota) {
		//super();
		this.telefono = telefono;
		this.mail = mail;
		this.expnum = expnum;
		this.dni = dni;
		this.fNac = fNac;
		this.nota = nota;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getExpnum() {
		return expnum;
	}
	public void setExpnum(int expnum) {
		this.expnum = expnum;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getfNac() {
		return fNac;
	}
	public void setfNac(String fNac) {
		this.fNac = fNac;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, edad, expnum, fNac, mail, nombre, nota, telefono);
	}

	@Override
	public String toString() {
		return "El/la alumno/a " + nombre + " " + apellido + " tiene " + edad + " años, el número de telefono " + telefono
				+ ", el mail " + mail + ", número de expedirnte " + expnum + ", el DNI " + dni + ", nació en la siguiente fecha " + fNac + " y tiene como nota media" + nota;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(dni, other.dni) && edad == other.edad
				&& expnum == other.expnum && Objects.equals(fNac, other.fNac) && Objects.equals(mail, other.mail)
				&& Objects.equals(nombre, other.nombre) && nota == other.nota && telefono == other.telefono;
	}
	
	
}
