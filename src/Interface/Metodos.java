package Interface;

import java.util.List;

import claseNormal.Clientes;

//PLANTILLA PARA DECLARAR METODOS VACIOS - ABSTRACTOS
public interface Metodos {
	//METODOS
	//1---FUNCIONES, SIEMPRE TIENE UN VALOR DE RETORNO
	//EL VALOR DE RETORNO- DE QUE TIPO DE DATO VAS A RETORNAR
	//SI VA A TENER PARAMETROS, CUANTOS Y DE QUE TIPO
	
	//2---PROCEDIMIENTOS, NO TIENE VALOR DE RETORNO
	//SI VA A TENER PARAMETROS, CUANTOS Y DE QUE TIPO
	
	//GUARDAR---PROCEDIMIENTO
	//MODIFICADOR DE ACCESO-VOID(POR QUE NO TIENE VALOR DE RETORNO)-EL NOMBRE DEL PROCEDIMIENTO-CUATOS PARAMETROS Y DE QUE TIPO
	public void guardar(Clientes cliente);
	
	//MOSTRAR-FUNCION
	//MODIFICADOR DE ACCESO-TIPO DE RETORNO-MOSTRAR
	public List<Clientes> mostrar();
	//BUSCAR
	public Clientes buscar(int indice);
	//EDITAR
	public void editar(int indice, Clientes cliente);
	//ELIMINAR
	public void eliminar(int indice);
	
	

}
