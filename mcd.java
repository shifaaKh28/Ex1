package ex1.mcd;

import java.util.Scanner;


/*this program calculates  Minimal Common Denominator (mcd) of three natural numbers.
 * in this program asking the user to input 3 numbers(x,y,z).
 * by using the function math.max we find the maximum value between x,y,z 
 * then store this value in variable called max.
 *  define variable mcd that initalize to be the max.
 *  after that use a while loop and check if the value of mcd is divisble by x,y,z 
 *  by using modulo % operation, if the mcd is divible by x,y,z we out of the loop 
 *  by doing break
 *  if  mcd dont divible by x,y,z we will add the value of max to mcd and return 
 *  to the while loop and check again if the the new value is divisble by x,y,z 
 */
public class Ex1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//defining the variables we want to check
		long x,y,z;

		//		do {
		//			//asking the user to input 3 numbers
		System.out.println("Enter three natural numbers:");
		//			//checks if the next token in the input stream is not a long.
		//			while (!sc.hasNextLong()) {
		//				System.out.println("Invalid input!");
		//				sc.next();
		//
		//			}
		x = sc.nextLong();
		y = sc.nextLong();
		z = sc.nextLong();

		// checks whether each three numbers are positive. 
		while (x <= 0 || y <= 0 || z <= 0);
		sc.close();


		//find the maximum value of x,y,z and initialize mcd to be the max value
		long max = Math.max(Math.max(x, y), z);
		long mcd = max;

		//using while loop and each itaration check if mcd divisble by x,y,z;
		while (true) {
			if (mcd % x == 0 && mcd % y == 0 && mcd % z == 0) {
				break;
			} 
			else {
				mcd += max;
			}
		}
		//print the value
		System.out.println("The Minimal Common Denominator (MCD) of " + x + ", " + y + " and " + z + " is: " + mcd);

	}

}
