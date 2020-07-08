package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Empregado;
import modelo.InterfazModelo;
import vista.InterfazModificaEmpregado;

public class ControladorModificaEmpregado implements ActionListener{
	InterfazModelo interfazModelo;
	InterfazModificaEmpregado interfazModificaEmpregado;
	ControladorModificaEmpregado(InterfazModelo iM,InterfazModificaEmpregado iME){
		this.interfazModelo=iM;
		this.interfazModificaEmpregado=iME;	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="modificar") {
			interfazModelo.eliminarEmpregado(new Empregado(interfazModificaEmpregado.getDni(),null,null,null));
			interfazModelo.engadirEmpregado(new Empregado(interfazModificaEmpregado.getDni(),interfazModificaEmpregado.getContrasinal(),interfazModificaEmpregado.getNome(),interfazModificaEmpregado.getTelefono()));	
		}
		if(e.getActionCommand()=="eliminar") {
			interfazModelo.eliminarEmpregado(new Empregado(interfazModificaEmpregado.getDni(),null,null,null));
		}
	}

}
