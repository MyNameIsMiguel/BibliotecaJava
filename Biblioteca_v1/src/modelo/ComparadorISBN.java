package modelo;

import java.util.Comparator;

public class ComparadorISBN implements Comparator<Libro>{

	@Override
	public int compare(Libro l1, Libro l2) {
		
		return l1.getISBN().compareTo(l2.getISBN());
	}

}
