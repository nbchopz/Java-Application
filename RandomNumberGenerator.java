import java.util.Scanner;
import java.util.Random;


public class RandomNumberGenerator{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Enter the upper limit to be generated: ");
		int upperlimit = scan.nextInt();
		
		if(upperlimit == 0){
			System.out.println("The number must be greater then 0");
		}
		else{
			in randomNum = random.nextInt(upperlimit) + 1;
			System.out.printf("The generate random number from 0 - %d is: %d%n",upperlimit,randomNum);
		}
	}
}
		