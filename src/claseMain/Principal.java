package claseMain;

import Implementacion.logicaMetodos;
import claseNormal.Clientes;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SE AGREGA NUEVO CODIGO
		float operacion= 450*20;
		System.out.println("resusltado: " +operacion);
		//COLECCION DE OBJETOS
		Clientes cliente = new Clientes(2, "Javier", 2361142647l, "javier@gmail.com");
		Clientes cliente2 = new Clientes(3, "Fransisco", 5642387966l, "fransisco@gmail.com");
		
		//REALIZAR LA INSTANCIA DE CLASE---YA TENEMOS ACCESO A TODO LO QUE CONTENGA LA CLASE
		logicaMetodos imp = new logicaMetodos();
		
		//METODO DE GUARDAR
		imp.guardar(cliente);
		imp.guardar(cliente2);
		
		System.out.println(imp.mostrar());
		
		//BUSCAR
		Clientes clienteEncont = null;
		clienteEncont = imp.buscar(1);
		
		System.out.println("Se encontro " +clienteEncont);
		
		//EDITAR---PRIMERO SE BUSCA
		clienteEncont = imp.buscar(0);
		clienteEncont.setNombre("Espinoza");
		imp.editar(0, clienteEncont);
		
		//MOSTRAR
		System.out.println(imp.mostrar());
		
		//ELIMINAR
		imp.eliminar(1);
		
		//MOSTRAR
		System.out.println(imp.mostrar());

	}

}
