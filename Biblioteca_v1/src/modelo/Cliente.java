package modelo;

public class Cliente {
	String DNI;
	String contrasinal;
	String nome;
	String telefono;
	public Cliente(String d,String c,String n,String t){
		this.DNI=d;
		this.contrasinal=c;
		this.nome=n;
		this.telefono=t;
		
	}
	public String getDNI() {
		return DNI;
	}
	public String getContrasinal() {
		return contrasinal;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefono() {
		return telefono;
	}
}
