package com.locker;

import java.util.Scanner;

import com.locker.FileManage;

public class Application {

public static void main(String[] args) {
		
		//Application and Developer Details
		System.out.println("\n ******************** LockedMe By Company Lockers *******************");
		System.out.println("Developed by Joswin Dsouza\n");
		
		//input for service request number
		int choice,c;
		
		//Object creation
		Scanner scan = new Scanner(System.in);
		
		mainloop : while(true) {
			
			//Main Menu
			
			System.out.println("\n1. Get file names (Ascending) ");
			System.out.println("2. Manipulate Files");
			System.out.println("3. Exit");
			
			System.out.print("Please enter your choice : ");
			
			//Choice Input for calculation
			choice = scan.nextInt();
			
			switch(choice) {
				
				case 1:
					
					//List function feature to list all files in ascending order.
					FileManage.listFiles();
					break;
				
				case 2:
					while(true)
					{
					System.out.println("\n1. Add File");
					System.out.println("2. Delete specified file");
					System.out.println("3. Search a file");
					System.out.println("4. Back");
					
					System.out.println("Enter your Choice: ");
					
					c = scan.nextInt();
					
					switch(c) {
					
					case 1:
						//Adding a file
						System.out.println("Enter name of the file to be added: ");
						String fileToBeCreated = scan.next();
						
						//Function to create a specific file given by user
						FileManage.createFile(fileToBeCreated);
						break;
						
					case 2:
						//Input for filename to be deleted
						System.out.print("Enter filename to be deleted: ");
						String fileToBeDeleted = scan.next();
						
						//Function to delete a specific file given by user
						FileManage.deleteFile(fileToBeDeleted);
						break;
						
					case 3:
						//Input for filename to be searched
						System.out.println("Enter filename to be searched: ");
						String fileToBeSearched = scan.next();
						
						//Function to search a specific file given by user
						FileManage.searchFile(fileToBeSearched);
						break;
						
					case 4:
						continue mainloop;
					}
				}
				case 3:
					
					//Releasing scanner resource
					scan.close();
					System.out.println("\n ****************** Thank you for using LokedMe ***************");
					System.exit(1);
					break;
				
				
				default:
					//Releasing scanner resource
					System.out.println("\n ****************** Please enter an option between 1-5 ************************");
					break;
				
					
				
			}		
			
		}
	}
}
