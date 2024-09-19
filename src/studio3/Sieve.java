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
		
		
		System.out.println(numbers);
		
	}

}
