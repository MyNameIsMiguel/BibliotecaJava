package modelo;

import java.util.Comparator;

public class ComparadorPrestamoAutor implements Comparator<Prestamo>{

	@Override
	public int compare(Prestamo o1, Prestamo o2) {
		return o1.l.getAutor().compareTo(o2.l.getAutor());
	}

}
