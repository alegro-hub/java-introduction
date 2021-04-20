package chapter06;

public class Main {
	public static void main(String[] args) {
		FuncList funclist = new FuncList();
		Func1 f1 = FuncList::isodd;

	}

	interface Func1{
		boolean call(int x);
	}

	interface Func2{
		String call(boolean male, String name);
	}



}
