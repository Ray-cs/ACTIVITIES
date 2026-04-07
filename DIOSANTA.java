package DIOSANTA;
import java.util.Scanner;
public class DIOSANTA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hotel[][] = new int[7][5];
		int op;
		do {
		System.out.print("\n===== HOTEL RESERVATION SYSTEM =====\n");
		System.out.print("\n1. View Rooms\n2. Check-In\n3. Check-out\n4. Exit");
		System.out.print("\n\nEnter option: ");
		op = sc.nextInt();
		
		switch (op) {
		 case 1: System.out.print("\n=====    ROOMS     =====\n");
		 for(int i = 0; i < hotel.length; i++) {
			 System.out.print("Floor " + (i+1) + ": ");
			 for(int j = 0;j<hotel[i].length; j++) {
			 System.out.print("[" + hotel[i][j]+ "]");
			 }
			 System.out.println();
	
		 }
		 break;
		 case 2: System.out.print("\n===== CHECK-IN =====");
		 System.out.print("\nEnter floor (1-7): ");
		 int floor = sc.nextInt();
		 System.out.print("Enter room (1-5): ");
		 int room = sc.nextInt();
		  
		 if (hotel[floor - 1][room - 1] == 0) {
			 hotel[floor - 1][room - 1] = 1;
			 System.out.print("\nCheck-In successfully\n");
		 }
		 else { System.out.print("\nRoom already occupied\n");
		 }
		 break;
		 case 3: System.out.print("\n===== CHECK-OUT =====");
		 System.out.print("\nEnter floor (1-7): ");
		 int fl = sc.nextInt();
		 System.out.print("Enter room (1-5): ");
		 int rm = sc.nextInt();
		  
		 if (hotel[fl - 1][rm - 1] == 1) {
			 hotel[fl - 1][rm - 1] = 0;
			 System.out.print("\nCheck-Out successfully!\n");
		 }
		 else { System.out.print("\nRoom already empty\n");
		 }
	
		 break;
		 case 4: System.out.print("\n===== EXIT =====\n");
		 System.out.print("\n   Thank you!\n");
		 
		 break;
		 default:{ System.out.print("\nInvalid Input\n"); }
			}	
		}while(op !=4);
	}
}
