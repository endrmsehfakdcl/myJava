package exam01;

public class ImpleTest {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		// Casting
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();

		InterfaceC ic = impl; // InterfaceC extends InterfaceA, InterfaceB
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
	}
}
