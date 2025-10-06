package main;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//Pruebas de pila:
		SimulatedStack<String> PilaSimulada = new SimulatedStack<>();
		
		if (PilaSimulada.pilaIsEmpty()) {
			System.out.println("La pila está vacia.");
		} else {
			System.out.println("Hay elementos en la pila.");
		}
		
		PilaSimulada.pilaPush("Elemento 1");
		PilaSimulada.pilaPush("Elemento 2");
		PilaSimulada.pilaPush("Elemento 3");
		PilaSimulada.pilaPush("Elemento 4");
		PilaSimulada.pilaPush("Elemento 5");
		
		System.out.println(PilaSimulada.pilaPeek());
		
		PilaSimulada.pilaPop();
		
		System.out.println(PilaSimulada.pilaPeek());
		
		
		
		//Pruebas de cola:
		SimulatedQueue<Integer> ColaSimulada = new SimulatedQueue<>();
		
		if (ColaSimulada.colaIsEmpty()) {
			System.out.println("La cola está vacia.");
		} else {
			System.out.println("Hay elementos en la cola.");
		}
		
		ColaSimulada.colaEnqueue(1);
		ColaSimulada.colaEnqueue(2);
		ColaSimulada.colaEnqueue(3);
		ColaSimulada.colaEnqueue(4);
		ColaSimulada.colaEnqueue(5);
		
		System.out.println(ColaSimulada.colaPeek());
		
		ColaSimulada.colaDequeue();
		
		System.out.println(ColaSimulada.colaPeek());
	}
}