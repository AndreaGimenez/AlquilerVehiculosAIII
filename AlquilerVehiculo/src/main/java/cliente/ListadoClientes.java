package cliente;

import java.util.ArrayList;
import java.util.Collection;

public class ListadoClientes {

	private Collection<Cliente> clientes;
	
	
	public ListadoClientes() {
		clientes = new ArrayList<Cliente>();
	}
	
	public void agregar(Cliente cliente) {
		clientes.add(cliente);
	}

	public Cliente obtener(Integer numeroDeCliente) throws ClienteNoEncontradoException {
		Cliente clienteADevolver = null;
		
		for(Cliente cliente : clientes) {
			if(numeroDeCliente == cliente.getNumero()) {
				clienteADevolver = cliente;
			}
		}
		
		if(clienteADevolver==null) {
			throw new ClienteNoEncontradoException();
		}
		
		return clienteADevolver;
	}
}
