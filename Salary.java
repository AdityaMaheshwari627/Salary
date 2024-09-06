//Salary per hour 
package Numbers;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter working hours:");
        int hrs = obj.nextInt();
        System.out.print("Enter hour wages:");
        int wage=obj.nextInt();
        System.out.print("The Total salary is "+(hrs*wage));
	}

}
