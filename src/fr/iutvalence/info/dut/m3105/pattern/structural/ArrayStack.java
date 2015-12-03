package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<T> implements Stack<T> {
	
	private T[] tab;
	private int nbItems;
	public ArrayStack()

	{
		tab = (T[]) new Object[10]; 
	}
	
	
	public void push(T element){
		this.tab[nbItems] = element;
		this.nbItems++;
		
	}
	
	public T pop(){
		T deletedElement = this.tab[nbItems];
		this.tab[nbItems]=null;
		this.nbItems--;
		return deletedElement;
	}
	
	public T peek(){
		return this.tab[nbItems];
	}
	
	public int size(){
		return this.nbItems;
		
	}

}
