package CarpetCost;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter width of the room: ");
	int width = scanner.nextInt();
	System.out.println("Enter length of the room: ");
	int length = scanner.nextInt();
	System.out.println("Enter price per square foot of carpet: ");
	int pricePerSquare =  scanner.nextInt();
	scanner.close();
	
	roomDimension roomdimension = new roomDimension(width,length);
	roomCarpet roomcarpet = new roomCarpet(roomdimension,pricePerSquare);
	int totalCost = roomcarpet.carpetCostCalculator();
	System.out.println("Total cost of the carpet "+ totalCost);
	
}
}
