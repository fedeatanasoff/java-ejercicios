package pila;

public class Pila<T> {

	private Nodo<T> tope;
	private int tamanio;
	
	public Pila() {
		this.tope = null;
		this.tamanio = 0;
	}
	
	public int size() {
		return this.tamanio;
	}
	
	public boolean estaVacia() {
		return tope == null;
	}
	
	public T tope() {
		return estaVacia() ? null : tope.getElemento();
	}
	
	// saca el elemento, guarda el contenido y lo elimina
	public T pop() {
		if (estaVacia()) {
			return null;
		} else {
			T elemento = tope.getElemento();
			Nodo<T> aux = tope.getSiguiente();
			tope = null;
			tope = aux;
			this.tamanio--;
			return elemento;
		}
	}
	
	public void push(T elemento) {
		Nodo<T> aux = new Nodo<>(elemento, tope);
		tope = aux;
		tamanio ++;
	}
	
	public String toString() {
		if(estaVacia()) {
			return "la pila esta vacia";
		}else {
			String res = "";
			Nodo<T> aux = tope;
			while(aux != null) {
				res += aux.toString();
				aux = aux.getSiguiente();
			}
			
			return res;
		}
	}
}
