package main_page;

import java.util.*;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class first {
	public static Scanner sc=new Scanner(System.in);
	public static ArrayList<String> files =new ArrayList<String>();
	
	public static void deleteFromDir(String name) {      //delete some file
		if (files.contains(name)){
			files.remove(name);
			System.out.println("Removed : " +name+"from the directory\n");
		}
		else {
			System.out.println("File " + name + " not present in the directory"+"\n");
		}
	}
	

	public static void display_file() {                    // display the list of files 
		System.out.println(files +"\n");
	}
	

	public static void addInDir(String name) {           // add a file 
		files.add(name);
		System.out.println(name + "  Added in the file"+"\n");
	}
	
	
	public static void searchFile(String name) {            // search if a file is present
		System.out.println("searching through \n");
		if (files.contains(name)){
			System.out.println("Present \n");
		}
		else {
			System.out.println("File " + name + " not present"+"\n");
		}
	}


	
	public static void main(String[] args) {               // here is my main method
		files.add("f1.txt");
		files.add("f2.txt");
		files.add("f3.txt");
		
		
		try {												
		System.out.println("Welcome to Assignment 1");
		display_page();
		display_choose(sc);
		sc.close();
	}catch (InputMismatchException e) {
		System.out.println("Wrong input.");	  
	}
	}

	

	private static void display_page() {					
		System.out.println("Choose An Option");
		System.out.println("================");

		System.out.println("1: View files");
		System.out.println("2: Edit files");
		System.out.println("3: Exit");
		
	}
	
	private static void display_choose(Scanner sc) {          
		int switchVal=sc.nextInt();
		switch(switchVal) {
		case 1:
			System.out.println("All the files are:  \n");
			display_file();
			display_page();
			display_choose(sc);
			break;
		case 2:
			chooseOption();
			second_choose(sc);
			break;
		case 3:
			System.out.println("Thank you");
			break;
		default:
			System.out.println("Please enter a valid option \n");
			display_page();
			display_choose(sc);
		}
		
	}

	private static void chooseOption() {                  
		System.out.println("Choose An Option");
		System.out.println("=================");

		System.out.println("1: Add a file");
		System.out.println("2: Delete file");
		System.out.println("3: Search any file");
		System.out.println("4: Return to Main Menu");
	}

	private static void second_choose(Scanner sc) {			
		int switchVal=sc.nextInt();
		switch(switchVal) {
		case 1:
			System.out.println("Enter the name of the file to add:  ");
			addInDir(sc.next());
			//System.out.println("Adding \n");
			chooseOption();
			second_choose(sc);
			break;
		case 2:
			System.out.println("Enter the name of file to delete:  ");
			deleteFromDir(sc.next());
			chooseOption();
			second_choose(sc);
			break;
		case 3:
			System.out.println("Contents of the files are");
			display_file();
			System.out.println("Enter Name: ");
			searchFile(sc.next());
			chooseOption();
			second_choose(sc);
			break;
		case 4:
			display_page();
			display_choose(sc);
			break;
			
			
		default:
			System.out.println("Select a valid option \n");
			chooseOption();
			second_choose(sc);
			break;
		}
	}
}


