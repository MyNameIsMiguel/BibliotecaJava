package vista;

import controlador.ControladorPrestamo;

public interface InterfazPrestamo {
	public void setControlador(ControladorPrestamo c);
	public String getDni();
	public String getIsbn();
	public String getFechaInicio();
	public String getFechaEntrega();
}
