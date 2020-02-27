package com.cg.iter.main;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.cg.iter.dto.Passenger;
import com.cg.iter.service.*;

public class PassengerMain {

	public PassengerMain() {
		PassengerService pService = new PassengerServiceImpl();
		Scanner sc = new Scanner(System.in);

		while (true) {
			displayMenu();

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				try {
					System.out.println("Enter Passenger type");
					String type = sc.next();
					System.out.println("Enter Id");
					String id = sc.next();
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter email");
					String email = sc.next();
					pService.addPassenger(new Passenger(type, id, name, email));
				} catch (InputMismatchException e) {

				}
				break;

			case 2:
				System.out.println("Enter ID to search");
				System.out.println(pService.viewPassenger(sc.next()));
			case 3:

				System.out.println("Enter ID to update");
				String id = sc.next();
				System.out.println("Enter Name");
				String PassengerName=sc.next();
				System.out.println("Enter email");
				String PassengerEmail=sc.next();
				System.out.println("Enter type");
				String passengerType=sc.next();
				Passenger pas = new Passenger(passengerType, id, PassengerName, PassengerEmail);
				pService.updatePassenger(pas);
				break;
			case 4:
				System.out.println("Enter ID to Delete");
				pService.deletePassenger(sc.next());
				break;

			default:
				System.out.println("Please Enter Correct Details..");
				break;
			}
		}
	}

	private void displayMenu() {
		System.out.println("1. Add the passenger");
		System.out.println("2. View the Passenger");
		System.out.println("3. update the passenger");
		System.out.println("4. delete the passenger");
		System.out.println("5. validate the Id of passenger");
		System.out.println("6. validate the phone no of passenger");
		System.out.println("7. validate the email of passenger");

	}

	public static void main(String[] args) {
		new PassengerMain();
	}
}
