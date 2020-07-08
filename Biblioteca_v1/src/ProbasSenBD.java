import controlador.ControladorConsulta;
import controlador.ControladorEmpleado;
import modelo.Biblioteca;
import vista.VistaConsulta;
import vista.VistaEmpleado;
import vista.VistaModificaEmpregado;
import vista.VistaResponsable;

public class ProbasSenBD {

	public static void main(String[] args) {
		Biblioteca biblioteca=new Biblioteca();
		VistaModificaEmpregado vistaEmpleado=new VistaModificaEmpregado ();
		//ControladorEmpleado controladorEmpleado=new ControladorEmpleado(biblioteca,vistaEmpleado);
		//vistaEmpleado.setControlador(controladorEmpleado);
	}

}
