package chapter12;

public class Main {

	public static void main(String[] args) {
		Y[] hairetu = new Y[2];

		hairetu[0] = new A();
		hairetu[1] = new B();

		for(Y value : hairetu) {
			value.b();
		}
	}

}
