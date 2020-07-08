import controlador.ControladorLogin;
import modelo.Biblioteca;
import modelo.InterfazModelo;
import vista.InterfazVistaLogin;
import vista.VistaLogin;

public class MainBiblioteca {

	public static void main(String[] args) {
		Biblioteca biblioteca=new Biblioteca();
		VistaLogin vistaLogin =new VistaLogin();
		ControladorLogin controladorLogin=new ControladorLogin(biblioteca,vistaLogin);
		vistaLogin.setControlador(controladorLogin);
	}

}
