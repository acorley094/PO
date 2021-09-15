package wo913;
import java.util.Scanner;

public class octal {
	public static void main(String[] args) {
		int num = 0;
		int rem;
		String str="";
		char digits[] = {'0','1','2','3','4','5','6','7'};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to be converted to it's octal: ");
		num = input.nextInt();
		
		System.out.println(num);
		
		while (num>0) {
			rem = num%8;
			str = digits[rem] + str;
			num = num/8;
		}
		
		System.out.println(str);
	}
}