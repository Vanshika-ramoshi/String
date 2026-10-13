package Strings;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter Fruits " + i + "-->");
			String fruit = sc.nextLine();
			System.out.print("Vowels: ");

			Vowels v = new Vowels();
			v.setFruit(fruit);

			v.displayVowels();
		}

	}

}
------------------------------------------------------------
  OUTPUT :
Enter Fruits 1-->apple
Vowels: Vowels -->
a
e

Enter Fruits 2-->Banana
Vowels: Vowels -->
a
a
a

Enter Fruits 3-->cherry
Vowels: Vowels -->
e

Enter Fruits 4-->mango
Vowels: Vowels -->
a
o

Enter Fruits 5-->kiwi
Vowels: Vowels -->
i
i
