package com.utc.sistemas;

public class ListaDoblementeEnlazada  extends EstructuraDatos{

	
	//buscar un elemento
	public boolean buscar(int valor) {
		Nodo actual=cabeza;
		while (actual!=null) {
			if (actual.dato==valor) {
				return true;
			}
			actual=actual.siguiente;
		}
		return false;
		
	}
	
	//Eliminar Un elemento de la Lista 
	
	public boolean eliminar (int valor) {
		
		Nodo actual = cabeza;
		while(actual != null && actual.dato!=valor) {
			actual= actual.siguiente;
			
		}
		//El elemento no Existe 
		if(actual==null) {
			return false;
		}
		
		//reconectar al nodo anterior 
		if (actual.anterior !=null) {
			actual.anterior.siguiente=actual.siguiente;
		}else {cabeza = actual.siguiente;
		}
		
		//reconectar al nodo siguiente
		
		if(actual.siguiente!= null) {
			actual.siguiente.anterior=actual.anterior;
		}else {
			cola=actual.anterior;
		}
		return true;
	}
	

}
