package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<E> implements List<E> {
	
	private E[] tab;
	private int nbItems;

	public ArrayList(){
		tab = (E[]) new Object[10];
	}

	@Override
	public void add(int i, E element) {
	this.nbItems++ ;
	this.tab[i] = element;
	}

	@Override
	public E remove(int i) {
		nbItems--;
		return this.tab[i];
	}

	@Override
	public E get(int position) {
		
		return this.tab[position];
	}

	@Override
	public int size() {

		return nbItems;
	}
	

	
	

}
