package pila;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila<Integer> pila = new Pila<>();
		System.out.println("la pila esta vacia?: "+  pila.estaVacia());
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(6);
		pila.push(5);
		pila.push(12);
		pila.push(51);
		System.out.println(pila);
		System.out.println("Tamaño de la pila: "+ pila.size());
		System.out.println("Tope de la pila: "+ pila.tope());
		int el = pila.pop();
		System.out.println("he eliminado el numero: "+ el);
		System.out.println("El nuevo tope de la pila es "+ pila.tope());
		System.out.println(pila.toString());
	}

}
