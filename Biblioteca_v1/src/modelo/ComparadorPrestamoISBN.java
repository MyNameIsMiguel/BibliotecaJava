package modelo;

import java.util.Comparator;

public class ComparadorPrestamoISBN implements Comparator<Prestamo>{

	@Override
	public int compare(Prestamo o1, Prestamo o2) {
		
		return o1.l.getISBN().compareTo(o2.l.getISBN());
	}

}
