package vista;

import java.util.ArrayList;

import controlador.ControladorLogin;

public interface InterfazVistaLogin {
	public String getDNI();
	public String getContrasinal();
	public void setErroneo(boolean nonValido);
	public void setControlador(ControladorLogin c);

}
