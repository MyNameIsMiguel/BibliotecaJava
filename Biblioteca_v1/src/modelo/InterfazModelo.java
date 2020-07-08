package modelo;

import java.util.LinkedList;

public interface InterfazModelo {
	public int validarUsuario(String dni,String Contrasinal);
	public void engadirLibro(Libro l);
	public void eliminarLibro (Libro l);
	public void engadirEmpregado(Empregado e);
	public void eliminarEmpregado (Empregado e);
	public void engadirCliente(Cliente c);
	public void eliminaCliente(Cliente c);
	public LinkedList<Libro> mostraLibros();
	public void engadirPrestamo(Prestamo p,String entregado);
	public void eliminarPrestamo(Prestamo  p);
	public LinkedList<Prestamo> mostraPrestamos(String dni);
	
}
