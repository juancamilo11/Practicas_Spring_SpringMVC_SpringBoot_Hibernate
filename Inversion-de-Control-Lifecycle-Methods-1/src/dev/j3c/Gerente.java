package dev.j3c;

public class Gerente implements Empleado {
	
	public Gerente() {}

	@Override
	public void metodoInicializacion() {
		System.out.println("Metodo ejecutado cuando se crea el bean");
	}
	
	@Override
	public void metodoDestruccion() {
		System.out.println("Metodo ejecutado antes de la destruccion del bean");
	}
	
	@Override
	public void registrarLlegada() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarLabores() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String describirActividades() {
		// TODO Auto-generated method stub
		return ("Soy el gerente, planifico, organizo y coordino el trabajo de la empresa");
	}

	@Override
	public void registrarSalida() {
		// TODO Auto-generated method stub
		
	}
	
}
