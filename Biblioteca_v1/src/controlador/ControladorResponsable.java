package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.InterfazModelo;
import vista.InterfazResponsable;
import vista.VistaEmpleado;
import vista.VistaModificaEmpregado;
	
public class ControladorResponsable implements ActionListener{
	InterfazModelo interfazModelo;
	InterfazResponsable interfazResponsable;
	ControladorResponsable(InterfazModelo iM,InterfazResponsable iR){
		this.interfazModelo=iM;
		this.interfazResponsable=iR;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="empregado") {
			VistaEmpleado vistaEmpleado=new VistaEmpleado();
			ControladorEmpleado controladorEmpleado=new ControladorEmpleado(interfazModelo,vistaEmpleado);
			vistaEmpleado.setControlador(controladorEmpleado);
		}
		if(e.getActionCommand()=="modifica") {
			VistaModificaEmpregado vistaModificaEmpregado=new VistaModificaEmpregado();
			ControladorModificaEmpregado controladorModificaEmpregado=new ControladorModificaEmpregado(interfazModelo,vistaModificaEmpregado);
			vistaModificaEmpregado.setControlador(controladorModificaEmpregado);
			
		}
	}

}
