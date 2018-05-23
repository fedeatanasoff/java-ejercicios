package pila;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo<Integer> nodo = new Nodo<Integer>(1, null);
		Nodo<Integer> nodo2 = new Nodo<Integer>(2, nodo);
		System.out.println(nodo2.toString());
	}

}
