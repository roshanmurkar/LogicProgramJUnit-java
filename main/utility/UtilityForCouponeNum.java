package main.utility;

import java.util.Scanner;

public class UtilityForCouponeNum {

	
	public static int getInput() {
		Scanner scan = new Scanner(System.in);
		int getUserInput = scan.nextInt();
		return getUserInput;
	}
	
	
	public static int getRandomNumber(int getUserInput) {
		return (int) (Math.random()*getUserInput);
	}
	
	
	public static int checkForCards(int getUserInput) {
		
		boolean[] insertCard = new boolean[getUserInput];  
        int count = 0;                           
        int newNumber  = 0;                       

        
        while (newNumber < getUserInput) {
            int value = getRandomNumber(getUserInput);             
            count++;  
            if (!insertCard[value]) {           
            	newNumber++;
            	insertCard[value] = true;
            }
        }
        
        
        return count;
		
	}
}
