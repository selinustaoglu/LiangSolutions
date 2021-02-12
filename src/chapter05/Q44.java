package chapter05;

public class Q44 {

	public static void main(String[] args) {
		byte b = 127;
		b++;
		System.out.println(b);
		b++;
		b++;
		System.out.println(b);
		b = (byte) (~b + 1); // two's complement
		System.out.println(b);
		
		System.out.println(1 << 1); // 0010
		System.out.println(1 << 2); // 0100
		System.out.println(1 << 3); // 1000
		System.out.println(1 << 4);
		
		short number = -1;
		String s = "";
		for (int i = 0; i < 16; i++) {
			s = (number & 1) + s;
			number >>>= 1;
		}
		System.out.println(s);
	}

}
