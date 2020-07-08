package modelo;

public class Libro {
String ISBN;
String Titulo;
String Autor;
	Libro(String i,String t,String a){
		this.ISBN=i;
		this.Titulo=t;
		this.Autor=a;
	}
	public String getISBN() {
		return ISBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public String getAutor() {
		return Autor;
	}
}
