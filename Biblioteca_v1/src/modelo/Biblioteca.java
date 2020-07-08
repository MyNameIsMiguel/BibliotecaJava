package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Biblioteca implements InterfazModelo{
	private Connection connection;
	@Override
	//1 cliente, 2 empregado,3 responsable,0 non valido
	public int validarUsuario(String dni, String contrasinal) {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");
			Statement statement=connection.createStatement();
			connection.setAutoCommit(false);
			ResultSet resultSet=statement.executeQuery("Select * from Persona where DNI='"+dni+"' and contrasinal='"+contrasinal+"'");
			while (resultSet.next()) {
					if(resultSet.getBoolean("Responsable")==true) {return 3;}
					if(resultSet.getBoolean("Empregado")==true) {return 2;}
					else {return 1;}
				}
				
			connection.commit();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro no acceso a base de datos");
			try {
				connection.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public void engadirLibro(Libro l) {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("insert into Libro(autro,titulo,ISBN) values ('"+l.Autor+"','"+l.Titulo+"','"+l.ISBN+"')");
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void eliminarLibro(Libro l) {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("Delete from libro where ISBN='"+l.ISBN+"'");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void engadirEmpregado(Empregado e) {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("insert into persona (DNI,contrasinal,nome,telefono,empregado,responsable) values('"+e.DNI+"','"+e.contrasinal+"','"+e.nome+"','"+e.telefono+"',true,false)");
			connection.close();
	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void eliminarEmpregado(Empregado e) {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("delete from persona where DNI='"+e.DNI+"'");
			connection.close();

		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}	
	}

	@Override
	public void engadirCliente(Cliente e) {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("insert into persona (DNI,contrasinal,nome,telefono,empregado,responsable) values('"+e.DNI+"','"+e.contrasinal+"','"+e.nome+"','"+e.telefono+"',false,false)");
			connection.close();
	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void eliminaCliente(Cliente c) {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("delete from persona where DIN='"+c.DNI+"'");
			connection.close();
	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public LinkedList<Libro> mostraLibros() {
		LinkedList<Libro>listaLibros=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from libro ");
			while(resultSet.next()) {
				listaLibros.add(new Libro(resultSet.getString("ISBN"),resultSet.getString("Titulo"),resultSet.getString("Autor")));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listaLibros;
	}

	@Override
	public void engadirPrestamo(Prestamo p,String entregado) {
		String date=GregorianCalendar.DAY_OF_YEAR+"-"+GregorianCalendar.DAY_OF_MONTH+"-"+GregorianCalendar.DAY_OF_WEEK;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
			Statement statement=connection.createStatement();
			if (entregado==null) {
				ResultSet resultSet=statement.executeQuery("insert into prestamo(Fecha_inicio,Fecha_entregado,DNI_persona,ISBN_libro) values ('"+date+"',"+entregado+",'"+p.c.DNI+"','"+p.l.ISBN+"')");
				
			}else {
				ResultSet resultSet=statement.executeQuery("insert into prestamo(Fecha_inicio,Fecha_entregado,DNI_persona,ISBN_libro) values ('"+date+"','"+entregado+"','"+p.c.DNI+"','"+p.l.ISBN+"')");
			}
			connection.close();		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}		
	}
	@Override
	public void eliminarPrestamo(Prestamo p) {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("delete from prestamo where ISBN_libro='"+p.l.ISBN+"' and DNI_persona='"+p.c.DNI+"'");
			connection.close();
		} catch (SQLException e) {		
			e.printStackTrace();
		}	
	}
	@Override
	public LinkedList<Prestamo> mostraPrestamos(String dni) {
		LinkedList<Prestamo>listaPrestamos=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from prestamo where dni='"+dni+"'");
			while(resultSet.next()) {
				listaPrestamos.add(new Prestamo(resultSet.getString("DNI_persona"),resultSet.getString("ISBN_libro"),resultSet.getString("Fecha_inicio"),resultSet.getString("Fecha_entregado")));		
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return listaPrestamos;
	}		
}


