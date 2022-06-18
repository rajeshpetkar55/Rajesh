package scannerClass;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		char name=s.next().charAt(0);
		System.out.println(name);
	}

}
