package wo913;
import java.util.*;
//import java.util.Scanner;

public class rot13 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to be encrypted: ");
		String s = input.nextLine();
	     for(int i = 0; i < s.length(); i++) {
	         char c = s.charAt(i);
	         if       (c >= 'a' && c <= 'm') c += 13;
	         else if  (c >= 'A' && c <= 'M') c += 13;
	         else if  (c >= 'n' && c <= 'z') c -= 13;
	         else if  (c >= 'N' && c <= 'Z') c -= 13;
	         System.out.print(c);
	     }
	     System.out.println();
	     
	     
	}
	
}
