package vista;

import controlador.ControladorModificaEmpregado;

public interface InterfazModificaEmpregado {
	public void setControlador(ControladorModificaEmpregado c);
	public String getDni();
	public String getNome();
	public String getContrasinal();
	public String getTelefono();
}	
