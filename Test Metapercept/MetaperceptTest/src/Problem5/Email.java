package Problem5;

import java.util.*;
public class Email {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter yoour email: ");
		String str = sc.nextLine();
		if(str.contains("@gmail.com")) {
			System.out.println("Sucess!!...");
		}else {
			System.out.println("Error!!....");
		}
	}

}
