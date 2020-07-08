package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Biblioteca;
import modelo.InterfazModelo;
import vista.InterfazConsulta;
import vista.InterfazVistaLogin;
import vista.VistaConsulta;
import vista.VistaEmpleado;
import vista.VistaResponsable;

public class ControladorLogin implements ActionListener{
	InterfazModelo iModelo;
	InterfazVistaLogin iVistaLogin;
	public ControladorLogin(InterfazModelo im,InterfazVistaLogin i){
		this.iModelo=im;
		this.iVistaLogin=i;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int roll=iModelo.validarUsuario(iVistaLogin.getDNI(), iVistaLogin.getContrasinal());
		if (roll==0) {iVistaLogin.setErroneo(true);}
		if (roll==1) 
		{
			VistaConsulta vistaConsulta=new VistaConsulta(iVistaLogin.getDNI());
			ControladorConsulta controladorConsulta=new ControladorConsulta(iModelo,vistaConsulta);
			vistaConsulta.setControlador(controladorConsulta);		
		}
		if (roll==2) 
		{
			VistaEmpleado vistaEmpleado=new VistaEmpleado();
			ControladorEmpleado controladorEmpleado=new ControladorEmpleado(iModelo,vistaEmpleado);
			vistaEmpleado.setControlador(controladorEmpleado);	
		}
		if (roll==3) 
		{
			VistaResponsable vistaResponsable=new VistaResponsable();
			ControladorResponsable controladorResponsable=new ControladorResponsable(iModelo,vistaResponsable);
			vistaResponsable.setControlador(controladorResponsable);	
		}
	}
}
