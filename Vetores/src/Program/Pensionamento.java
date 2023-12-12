package Program;

import java.util.Scanner;

import Entities.DateRooms;

public class Pensionamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("How many room will be rented? ");
		int rooms = sc.nextInt()	;
		DateRooms [] room = new DateRooms [10];
		String name;
		String email;
		int nRoom;
		
		for (int i = 0; i < rooms; i++)
		{
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			nRoom = sc.nextInt();
			room[nRoom] = new DateRooms (name, email,nRoom);
		}
		
	
		System.out.println("Busy Rooms: ");
		for (int i = 0; i < room.length; i++)
		{
			if (room[i] != null)
			{
				System.out.println(room[i].getNroom() + ": " + room[i].getName() + ", " + room[i].getEmail());
			}
		}
		
		sc.close();

	}

}
