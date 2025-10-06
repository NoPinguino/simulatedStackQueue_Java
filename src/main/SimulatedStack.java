package main;
import java.util.ArrayList;

public class SimulatedStack<T> {
	private ArrayList<T> PilaSimulada;
	
	//Constructor
	public SimulatedStack() {
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
			PilaSimulada.remove(PilaSimulada.get(PilaSimulada.size() - 1));
			System.out.println("Último elemento eliminado con éxito.");
		} else {
			System.out.println("La lista está vaciía.");
		}
	}
	
	public T PilaPeek() {
		int cantidad_elementos = PilaSimulada.size();
		return PilaSimulada.get(cantidad_elementos - 1);
	}
	
	//Comprobar si la lista está vacía
	public boolean PilaIsEmpty() {
		return PilaSimulada.isEmpty();
	}
}
