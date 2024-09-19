package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers? ");
		int n  = in.nextInt();
		
		int[] numbers = new int[n-2];
		
		for(int i = 0; i < n-2; i++) {
			numbers[i] = i + 2;
			
		}
		
		
		
		boolean[] prime = new boolean[n-2];
		
		for(int a = 0; a < prime.length; a++) {
			prime[a] = true;
					
		}
		
		
		for(int a = 2; a < prime.length; a++) {
			for(int number = a*2; number < n-2; number+=a) {
				prime[n-2] = false;
				
			}
			
		}
		
	}
}
	
