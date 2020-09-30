package Input;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Type your name here: ");
		String name = kb.nextLine();
		System.out.println("Type your age here: ");
		int age = kb.nextInt();
		int year = 2020-age;
		System.out.println("Hello "+ name +"! I can't believe you were born in "+ year +"! Here is a cup of java!");
		System.out.println("   x   x    x \n"
				+          "  x    x   x \n"
				+ 		   "   x  x   x \n\n"
				+          "  xxxxxxxxxx\n "
				+           "  xxxxxxxxxxx\n "
				+           "  xxxxxxxx  x\n "
				+           "  xxxxxxxxxxx\n   "
				+             "  xxxx");
		 
	}
}
