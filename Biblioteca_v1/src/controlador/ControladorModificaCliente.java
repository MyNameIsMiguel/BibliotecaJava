package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Cliente;
import modelo.InterfazModelo;
import vista.InterfazModificaCliente;

public class ControladorModificaCliente implements ActionListener{
	InterfazModelo interfazModelo;
	InterfazModificaCliente interfazModificaCliente;
	ControladorModificaCliente(InterfazModelo iM,InterfazModificaCliente iMC){
		this.interfazModelo=iM;
		this.interfazModificaCliente=iMC;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand()=="modificar") {
			interfazModelo.eliminaCliente(new Cliente(interfazModificaCliente.getDni(),null,null,null));
			interfazModelo.engadirCliente(new Cliente(interfazModificaCliente.getDni(),interfazModificaCliente.getContrasinal(),interfazModificaCliente.getNome(),interfazModificaCliente.getTelefono()));
		}
		if(e.getActionCommand()=="eliminar") {
			interfazModelo.eliminaCliente(new Cliente(interfazModificaCliente.getDni(),null,null,null));
		}
	}

}
