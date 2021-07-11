package main.utility;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UPrimeNum {
	
	public static int getInput() {
		
		Scanner scan = new Scanner(System.in);
		int getUserInput = scan.nextInt();
		return getUserInput;
	}
	
	public static int checkPrimeNum(int checkPrime) {
		int flag=0;
		for(int i=2;i<=checkPrime;i++) {
			if(checkPrime%i==0) {
				flag++;
			}
		}
		return flag;
	}
}
