package vista;

import controlador.ControladorConsulta;

public interface InterfazConsulta {
	public void setTexto(String texto);
	public void borraTexto();
	public String ordenadoPor();
	public String getDni();
	public void setControlador(ControladorConsulta c);
}
