package modelo;

import java.util.Comparator;

public class ComparadorPrestamosTitulo implements Comparator<Prestamo>{

	@Override
	public int compare(Prestamo o1, Prestamo o2) {
		
		return o1.l.getTitulo().compareTo(o2.l.getTitulo());
	}

}
