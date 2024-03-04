package org.islasfilipinas;

public class Main_Alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creo los objetos que pide el ejercicio( el alumno 1, 2 y 3 ) 
		// introduzco los atributos de cada uno teniendo los mismos el alumno 2 y 3

		Alumno alumno1=new Alumno();
		alumno1.setNombre("Jenny");
		alumno1.setApellido("Smith");
		alumno1.setEdad(18);
		alumno1.setTelefono(123456789);
		alumno1.setMail("jennysmith@gmail");
		alumno1.setExpnum(123456789);
		alumno1.setDni("123456789Y");
		alumno1.setfNac("2005-12-13");
		alumno1.setNota(8);
		
		Alumno alumno2=new Alumno();
		alumno2.setNombre("Benn");
		alumno2.setApellido("Reilly");
		alumno2.setEdad(20);
		alumno2.setTelefono(987654321);
		alumno2.setMail("bennreilly@gmail");
		alumno2.setExpnum(987654321);
		alumno2.setDni("987654321Y");
		alumno2.setfNac("2003-1-20");
		alumno2.setNota(6);
		
		Alumno alumno3=new Alumno();
		alumno3.setNombre("Benn");
		alumno3.setApellido("Reilly");
		alumno3.setEdad(20);
		alumno3.setTelefono(987654321);
		alumno3.setMail("bennreilly@gmail");
		alumno3.setExpnum(987654321);
		alumno3.setDni("987654321Y");
		alumno3.setfNac("2003-1-20");
		alumno3.setNota(6);
		
		// uso el metodo toString que esta en la clase alumno para enseñar
		// los atributos de cada alumno/objeto 
		
		System.out.println(alumno1.toString());
		System.out.println(alumno2.toString());
		System.out.println(alumno3.toString());
		System.out.println("Los alumnos 2 y 3 se parecen?");
		
		// y por ultimo uso el metodo equals para comprobar que tal y como pide 
		// el ejercicio los alumnos 2 y 3 tienen los mismos atributos
		
		System.out.println(alumno2.equals(alumno3));;
		
		if (alumno2.equals(alumno3)==true) {
			System.out.println("*****Error alumno duplicado"
					+ "*****");
		} else {
			System.out.println("*No se ha detectado ningun alumno duplicado*");
		}
	}

}
