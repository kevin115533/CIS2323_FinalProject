import library.*;
import java.util.*;

public class MacroManager{
	public static void main(String[] args){
		boolean keepGoing = true;
		int userOpt;
		
		Scanner input = new Scanner(System.in);
		Profile user = new Profile();
		
		System.out.println("Welcome to the Macro Manager");
		
		while(keepGoing == true){
			System.out.println("============================");
			System.out.println("1. Edit Profile");
			
			user.printProfile();
			System.out.print("What would you like to do: ");
			userOpt = input.nextInt(); 
			
			switch(userOpt){
				case 1:
					user.editProf();
			}
		}
	}
}