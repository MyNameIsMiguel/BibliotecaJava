package vista;

import controlador.ControladorModificaCliente;

public interface InterfazModificaCliente {
	public void setControlador(ControladorModificaCliente c);
	public String getDni();
	public String getNome();
	public String getContrasinal();
	public String getTelefono();
}
