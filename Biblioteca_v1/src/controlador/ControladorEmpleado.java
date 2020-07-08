package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.InterfazModelo;
import vista.InterfazEmpleado;
import vista.VistaConsulta;
import vista.VistaModificaCliente;
import vista.VistaModificaLibros;
import vista.VistaPrestamo;

public class ControladorEmpleado implements ActionListener{
	InterfazModelo iM;
	InterfazEmpleado iE;
	public ControladorEmpleado(InterfazModelo iM,InterfazEmpleado iE){
		this.iM=iM;
		this.iE=iE;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="cliente") {
			VistaModificaCliente vistaModificaCliente=new VistaModificaCliente();
			ControladorModificaCliente controladorModificaCliente=new ControladorModificaCliente(iM,vistaModificaCliente);
			vistaModificaCliente.setControlador(controladorModificaCliente);
		}
		if(e.getActionCommand()=="prestamo") {
			VistaPrestamo vistaPrestamo=new VistaPrestamo();
			ControladorPrestamo controladorPrestamo=new ControladorPrestamo();
			vistaPrestamo.setControlador(controladorPrestamo);
		}
		if(e.getActionCommand()=="libro") {
			VistaModificaLibros vistaModificaLibros=new VistaModificaLibros();
			ControladorXestionLibros controladorXestionLibros=new ControladorXestionLibros();
			vistaModificaLibros.setControlador(controladorXestionLibros);
		}
		if(e.getActionCommand()=="consulta") {
			VistaConsulta vistaConsulta=new VistaConsulta("empregado");
			ControladorConsulta controladorConsulta=new ControladorConsulta(iM,vistaConsulta);
			vistaConsulta.setControlador(controladorConsulta);
		}	
	}
}