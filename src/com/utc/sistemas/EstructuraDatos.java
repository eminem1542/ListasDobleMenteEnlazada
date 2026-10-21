package com.utc.sistemas;

public class EstructuraDatos {

	
	protected Nodo cabeza;
	protected Nodo cola;
	
	
	protected  static class Nodo {
		//  definir el tipo de dato que va almacenar 
		int dato;
		Nodo anterior;
		Nodo siguiente;
		
		// metodo contructor de nodos 
		public Nodo (int  dato) {
			
			this.dato = dato;
			this.anterior = null;
			this.siguiente= null;
		}
		
	}
	//meto para insertar  un elemento  al final 
	public void insertar(int dato) {
		Nodo nuevoNodo = new Nodo(dato);
		
		if  (cabeza== null) {
			cabeza = nuevoNodo;
			cola = nuevoNodo;
		} else {
			cola.siguiente = nuevoNodo;
			
			nuevoNodo.anterior = cola;
			cola= nuevoNodo;
		}
	}
	
	// recorrer lista  de izquierda a derecha 
	public void mostrarDelante() {
		Nodo actual =  cabeza;
		
		System.out.print("Adelante: ");
		
		while (actual !=null) {
			System.out.print(actual.dato + "<->");
			
			actual= actual.siguiente;
		}
		
		System.out.print("NULL");
	}
	
	//RECORRER LISTA DE DERECHE A IZQUIERDA 
	
	public void mostrarAtras() {
		Nodo actual = cola;
		
		System.out.print("Atras: ");
		
		while (actual!=null) {
			System.out.print(actual.dato+" <-> ");
			actual= actual.anterior;
			
		}
		System.out.print("NULL");
	}
	
	//CLASE HIJA:  HEREDA DE  EstructuraDatos
	

	


}
