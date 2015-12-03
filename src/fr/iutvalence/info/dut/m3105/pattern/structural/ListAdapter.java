package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ListAdapter<T> implements Stack<T> {

	private List<T> liste;

	public ListAdapter(){
		liste = new ArrayList<T>();
	}
	
	
	@Override
	public void push(Object element) {
		this.liste.add()		
	}

	@Override
	public T pop() {
		return this.liste.remove(this.liste.size());
	}

	@Override
	public T peek() {
		return this.liste.get(this.liste.size());
	}

	@Override
	public int size() {
		return 0;
	}

}
