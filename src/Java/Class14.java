package Java;

public class Class14 {

	public static void main(String[] args) {
		byte b;
		int i; b = 10;
		i = b * b; // OK, no cast needed  
		b = 10;
		b = (byte) (b * b); // cast needed!! as cannot assign int to byte
		System.out.println("i and b: " + i + " " + b);
	}

}
