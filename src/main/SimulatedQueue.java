package main;
import java.util.LinkedList;

public class SimulatedQueue<T> {
	private LinkedList<T> ColaSimulada;
	
	//Constructor
	public SimulatedQueue() {
		ColaSimulada = new LinkedList<T>();
	}
	
	//Enqueue
	public void colaEnqueue(T elemento) {
		ColaSimulada.addLast(elemento);
		System.out.println("Elemento añadido al final.");
	}
	
	//Dequeue
	public void colaDequeue() {
		if (ColaSimulada.isEmpty()) {
			System.out.println("La cola está vacia.");
		} else {
			ColaSimulada.removeFirst();
			System.out.println("Elemento eliminado al inicio.");
		}
	}
	
	//Peek
	public T colaPeek() {
		if (!ColaSimulada.isEmpty()) {
			T ultimo_elemento = ColaSimulada.getLast();
			return ultimo_elemento;
		} else {
			return null;
		}
	}
	
	//IsEmpty
	public boolean colaIsEmpty() {
		return ColaSimulada.isEmpty();
	}
}
