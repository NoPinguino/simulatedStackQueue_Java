package main;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		SimulatedStack<String> PilaSimulada = new SimulatedStack<>();
		
		if (PilaSimulada.PilaIsEmpty()) {
			System.out.println("La pila está vacia.");
		} else {
			System.out.println("Hay elementos en la pila.");
		}
		
		//Prueba de push
		PilaSimulada.PilaPush("Elemento 1");
		PilaSimulada.PilaPush("Elemento 2");
		PilaSimulada.PilaPush("Elemento 3");
		PilaSimulada.PilaPush("Elemento 4");
		PilaSimulada.PilaPush("Elemento 5");
		
		System.out.println(PilaSimulada.PilaPeek());
		
		PilaSimulada.PilaPop();
		
		System.out.println(PilaSimulada.PilaPeek());
	}
}