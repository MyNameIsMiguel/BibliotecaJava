package modelo;

public class Prestamo {
	Cliente c;
	String DNI_cliente=c.DNI;
	Libro l;
	String ISBN_libro=l.ISBN;
	String fechaInicio=null;
	String fechaEntregado=null;
	Prestamo(Cliente c,Libro l,String fechaInici,String fechaEntregado){
		this.c=c;
		this.l=l;
		this.fechaInicio=fechaInici;
		this.fechaEntregado=fechaEntregado;
	}
	Prestamo(String DNI,String ISBN,String fechaInici,String fechaEntregado){
		this.fechaInicio=fechaInici;
		this.fechaEntregado=fechaEntregado;
		this.DNI_cliente=DNI;
		this.ISBN_libro=ISBN;
	}
	public String getDNI_cliente() {
		return DNI_cliente;
	}
	public String getISBN_libro() {
		return ISBN_libro;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public String getFechaEntregado() {
		return fechaEntregado;
	}
	public String toString() {
		return l.getTitulo()+" - "+l.getAutor()+""+l.getISBN();
	}
}
