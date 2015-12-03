package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester {
	
	private Stack<String> stack;

	public StackOfStringTester(Stack<String> stack) {
		this.stack = stack;
	}

	public void testStack() {
		String peekOhTheStack="";
		System.out.println("Size of the stack = "+stack.size());
		stack.push("a");
		System.out.println("Size of the stack = "+stack.size());
		stack.push("b");
		System.out.println("Size of the stack = "+stack.size());
		peekOhTheStack = stack.peek();
		System.out.println("peek of the stack = "+peekOhTheStack);
		System.out.println("Size of the stack = "+stack.size());
		String popedElement = stack.pop();
		System.out.println("poped element = "+popedElement);
		System.out.println("Size of the stack = "+stack.size());
		popedElement = stack.pop();
		System.out.println("poped element = "+popedElement);
		System.out.println("Size of the stack = "+stack.size());

	}

}
