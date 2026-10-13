package Strings;

public class Vowels {

//	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);

//		for(int i =1; i<=5; i++) {
//		System.out.print("Enter Fruits " +i+"-->");
//		String fruit = sc.nextLine();
//		System.out.print("Vowels: ");

	private String fruit;

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getFruit() {
		return fruit;
	}

	public void displayVowels() {
		System.out.println("Vowels -->");

		for (int j = 0; j < fruit.length(); j++) {
			char ch = fruit.charAt(j);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U') {
				System.out.println(ch);
			}
		}
		System.out.println();
	}
}
