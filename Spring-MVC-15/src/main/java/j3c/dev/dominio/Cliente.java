package j3c.dev.dominio;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cliente {
	
	@NotNull(message="Este campo es obligatorio")
	@Size(min=3, message="Minimo 3 caracteres")
	private String nombre;
	
	private String apellido;
	
	@Min(value=4, message="La edad minima aceptada es de 4 anios")
	@Max(value=10, message="La edad maxima aceptada es de 10 anios")
	private int edad;
	
	public Cliente() {
	}
	
	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellido=" + apellido + " ,edad=" + edad + "]";
	}
	
	
}
