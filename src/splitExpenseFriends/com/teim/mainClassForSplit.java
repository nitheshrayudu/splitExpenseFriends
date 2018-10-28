package splitExpenseFriends.com.teim;
import java.util.Scanner;

import javax.swing.*; 

public class mainClassForSplit {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int numberOfPeople=0;
		String[] peopleNames = null;
		String groupName=null;

		System.out.println("Enter the Group Name");
		
		Scanner groupNameScanner = new Scanner(System.in);
		
		groupName = groupNameScanner.next();
		
		 groupNameScanner.close();
		
		System.out.println("The Group Name is "+groupName);
		
		System.out.println("Enter the number of participants");
		
		Scanner peopleNumberScanner = new Scanner(System.in);
		
		numberOfPeople = peopleNumberScanner.nextInt();
		peopleNumberScanner.next();
		
		peopleNumberScanner.close();
		
		System.out.println("Number Of People Entered = "+numberOfPeople);
		
		System.out.println("Enter the names");
		
		Scanner peopleNamesGetter = new Scanner(System.in);
		
		for(int i=0;i<numberOfPeople;i++)
		{
		
			peopleNames[i]=peopleNamesGetter.nextLine();
			System.out.println(peopleNames[i]);
			
		}
		
		
		
		
		
		
	}
}
