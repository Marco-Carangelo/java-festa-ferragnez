package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		//Guests array declaration
		String partyGuests[];
		
		//Guests array population
		partyGuests = new String[] {"Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};
		
		//Create an instance of the Scanner class and ask the user his name
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome(nome e cognome o nome d'arte) per verificare se sei nella lista degli invitati: ");
		
		//Initialize a variable and assign to it the user input
		String userName = scanner.nextLine();
		
		//Initialize a boolean variable to control if the guest is found
		boolean guestFound = false;
		
		//WHILE CYCLE SOLUTION
		
		//Initialize the cycle index
		 int i = 0;
		 
		 
		 while(i<partyGuests.length && !guestFound) {
			 
			 if(userName.equalsIgnoreCase(partyGuests[i])) {
				 guestFound = true;
			 }
			 
			 i++;
		 }
		
		
		 
		 
		 //Display the result to the user
		 
		 if(guestFound) {
			 System.out.println("Il tuo nome è nella lista degli invitati, goditi il party!");
		 }else {
			 System.out.println("Mi dispiace " + userName + " il tuo nome non è nella lista degli invitati.");
		 }
		 
		
	}
}
