package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos;
import claseNormal.Clientes;

public class logicaMetodos implements Metodos {
	
	private List<Clientes> lista = new ArrayList<Clientes>();

	@Override
	public void guardar(Clientes cliente) {
		// TODO Auto-generated method stub
		lista.add(cliente);
	}

	@Override
	public List<Clientes> mostrar() {
		// TODO Auto-generated method stub
		List<Clientes> listaNueva = new ArrayList<Clientes>();
		listaNueva = lista;
		return listaNueva;
	}

	@Override
	public Clientes buscar(int indice) {
		// TODO Auto-generated method stub
		Clientes clienteEncontrado = null;
		clienteEncontrado = lista.get(indice);
		return clienteEncontrado;
	}

	@Override
	public void editar(int indice, Clientes cliente) {
		// TODO Auto-generated method stub
		lista.set(indice, cliente);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

}
