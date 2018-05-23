package pila;

public class Nodo<T> {
	
	private T elemento;
	private Nodo<T> siguiente;
	
	public Nodo(T elem, Nodo<T> sig) {
		this.elemento = elem;
		this.siguiente = sig;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public String toString() {
		return "elem: "+ elemento  + "\n";
	}
	
	
}
