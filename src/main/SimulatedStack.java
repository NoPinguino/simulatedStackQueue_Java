package main;
import java.util.ArrayList;

public class SimulatedStack<T> {
	private ArrayList<T> PilaSimulada;
	
	//Constructor
	public SimulatedStack() {
		PilaSimulada = new ArrayList<T>();
	}
	
	//Añadir elemento al final
	public void pilaPush(T elemento) {
		PilaSimulada.add(elemento);
		System.out.println("Elemento añadido al final.");
	}
	
	//Eliminar último elemento
	public void pilaPop() {
		if (!PilaSimulada.isEmpty()) {
			PilaSimulada.remove(PilaSimulada.get(PilaSimulada.size() - 1));
			System.out.println("Elemento eliminado al final.");
		} else {
			System.out.println("La lista está vaciía.");
		}
	}
	
	public T pilaPeek() {
		int cantidad_elementos = PilaSimulada.size();
		return PilaSimulada.get(cantidad_elementos - 1);
	}
	
	//Comprobar si la lista está vacía
	public boolean pilaIsEmpty() {
		return PilaSimulada.isEmpty();
	}
}
