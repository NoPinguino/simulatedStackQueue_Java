package main;
import java.util.ArrayList;

public class Stack<T> {
	private ArrayList<T> PilaSimulada;
	
	//Constructor
	public Stack() {
		PilaSimulada = new ArrayList<T>();
	}
	
	//Añadir elemento al final
	public void PilaPush(T elemento) {
		PilaSimulada.add(elemento);
		System.out.println("Elemento añadido con éxito.");
	}
	
	//Eliminar último elemento
	public void PilaPop() {
		if (!PilaSimulada.isEmpty()) {
			PilaSimulada.remove(-1);
			System.out.println("Último elemento eliminado con éxito.");
		} else {
			System.out.println("La lista está vaciía.");
		}
	}
	
	//Comprobar si la lista está vacía
	public boolean PilaIsEmpty() {
		return PilaSimulada.isEmpty();
	}
	
	public int PilaSearch(T elemento) {
		int contadorElementos = 0;
		boolean encontrado = false;
		for (T i : PilaSimulada) {
			if (!encontrado) {
				contadorElementos++;
			}
			if (i.equals(elemento)) {
				encontrado = true;
			}
		}
		return contadorElementos;
			
	}
	
	//Devuelve tamaño de la lista.
	public int PilaSize() {
		int contadorElementos = 0;
		for (T i : PilaSimulada) {
			contadorElementos++;
		}
		return contadorElementos;
	}
}
