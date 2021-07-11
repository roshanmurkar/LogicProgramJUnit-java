package main;

import java.util.logging.Logger;

import main.utility.UVendingMc;

public class VendingMc {
	public final static Logger logger=Logger.getLogger("VendingMachine");
	public static void main(String[] args) {
		int[] arrayOfNotes=new int[8];
		
		
		
		//getting input from user
		int getInput=UVendingMc.getUserInput();
		
		//checking for change from machine
		UVendingMc.change(getInput);
		
		
	}
}
