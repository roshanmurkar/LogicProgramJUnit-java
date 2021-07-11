package main.utility;

import java.util.Scanner;

public class URevNum {

	public static int getInput() {
		Scanner scan = new Scanner(System.in);
		int getUserInput = scan.nextInt();
		return getUserInput;
	}

	public static int reverseNumber(int getUserInput) {
		int lastNum=0;
		int revNum=0;
		while(getUserInput!=0) {
			lastNum=getUserInput%10;
			revNum= revNum*10+lastNum;
			getUserInput=getUserInput/10;
		}
		return revNum;
	}
}
