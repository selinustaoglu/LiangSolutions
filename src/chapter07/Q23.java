package chapter07;

public class Q23 {//TODO

	public static void main(String[] args) {
		 
		boolean[] lockers = new boolean[100];
		
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < lockers.length; j=j+i) {
				if(lockers[j] == false) {
					lockers[j]=true;
				}else {
					lockers[j]=false;
				}
			}
		}
		
		for (int i = 0; i < lockers.length; i++) {
			if(lockers[i] == true) {
				System.out.print(" " + i);
			}
		}

	}

}
