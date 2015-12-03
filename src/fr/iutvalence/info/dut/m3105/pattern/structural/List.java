package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<E> {
	

	public void add(int i, E element);
	
	public E remove(int i);
	
	public E get(int position);
	
	public int size();


}
