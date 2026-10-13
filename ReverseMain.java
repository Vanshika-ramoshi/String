package Strings;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
    // java---avaj
    System.out.print("Enter a String --> ");
		String str = sc.nextLine();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse String--> " + rev);
	}

}
output-->
  Enter a String --> JAVA
Reverse String: AVAJ
