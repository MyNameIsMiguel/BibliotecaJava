package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import modelo.ComparadorAutor;
import modelo.ComparadorISBN;
import modelo.ComparadorPrestamoAutor;
import modelo.ComparadorPrestamoISBN;
import modelo.ComparadorPrestamosTitulo;
import modelo.ComparadorTitulo;
import modelo.InterfazModelo;
import modelo.Libro;
import modelo.Prestamo;
import vista.InterfazConsulta;

public class ControladorConsulta implements ActionListener{
	InterfazModelo interfazModelo;
	InterfazConsulta interfazConsulta;
 public ControladorConsulta(InterfazModelo iM,InterfazConsulta iC){
	 this.interfazModelo=iM;
	 this.interfazConsulta=iC;
 }
@Override
public void actionPerformed(ActionEvent e) {
	LinkedList<Libro> listaLibros;
	LinkedList<Prestamo> listaPrestamos;
	if(e.getActionCommand()=="libros") {
		listaLibros=interfazModelo.mostraLibros();
		interfazConsulta.borraTexto();
		if (interfazConsulta.ordenadoPor()=="ISBN") {listaLibros.sort(new ComparadorISBN());}
		if (interfazConsulta.ordenadoPor()=="Titulo") {listaLibros.sort(new ComparadorTitulo());}
		if (interfazConsulta.ordenadoPor()=="Autor") {listaLibros.sort(new ComparadorAutor());}
		for(Libro l:listaLibros) {
			interfazConsulta.setTexto(l.getTitulo()+" - "+l.getAutor()+" - "+l.getISBN()+System.lineSeparator());
		}
	}
	if(e.getActionCommand()=="prestamo") {
		listaPrestamos=interfazModelo.mostraPrestamos(interfazConsulta.getDni());
		interfazConsulta.borraTexto();
		if (interfazConsulta.ordenadoPor()=="ISBN") {listaPrestamos.sort(new ComparadorPrestamoISBN());}
		if (interfazConsulta.ordenadoPor()=="Titulo") {listaPrestamos.sort(new ComparadorPrestamosTitulo());}
		if (interfazConsulta.ordenadoPor()=="Autor") {listaPrestamos.sort(new ComparadorPrestamoAutor());}
		for (Prestamo p:listaPrestamos) {
			interfazConsulta.setTexto(p.toString()+System.lineSeparator());
		}
	}
	
}
 
}
