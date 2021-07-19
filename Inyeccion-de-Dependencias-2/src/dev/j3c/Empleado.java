package dev.j3c;

public interface Empleado {
	void registrarLlegada();
	void iniciarLabores();
	String describirActividades();
	void registrarSalida();
	Reporte getReporte();
	void setReporte(Reporte reporte);
}
