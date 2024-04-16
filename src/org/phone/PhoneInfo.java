package org.phone;

public class PhoneInfo {
	private void phoneName(int i, float j, double k) {
		System.out.println("MyPhone: RedMi");
	}
	private void phoneName(char c, String name, long i) {
		System.out.println("MyPhone: RedMi2");
	}
	private void phoneName(long i, String namee, char c) {
		System.out.println("MyPhone: RedMi3");
	}
	public static void main(String[] args) {
		PhoneInfo b = new PhoneInfo();
		b.phoneName('h', "karen", 657686876l);
		b.phoneName(7, 9.7f, 778.98);
		b.phoneName(87896765l, "Hello", 'l');
		
	}

}
//phoneName(),phoneMieiNum(),Camera(),storage(),osName()