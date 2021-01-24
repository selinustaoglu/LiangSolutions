package chapter06;

public class Q23 {
	
	public static int count(String str, char a) {
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.toString(str.charAt(i)).equals(Character.toString(a))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(count("eindhoven", 'e'));

	}

}
