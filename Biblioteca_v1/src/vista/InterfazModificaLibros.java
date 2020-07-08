package vista;

import controlador.ControladorXestionLibros;

public interface InterfazModificaLibros {
	public void setControlador(ControladorXestionLibros c);
	public String getIsbn();
	public String getTitulo();
	public String getAutor();
}
