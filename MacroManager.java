import library.*;
import java.util.*;

public class MacroManager{
	public static void main(String[] args){
		boolean keepGoing = true;
		int userOpt;
		
		Scanner input = new Scanner(System.in);
		Profile user = new Profile();
		Log item = new Log();
		
		System.out.println("Welcome to the Macro Manager");
		
		while(keepGoing == true){
			System.out.println("============================");
			System.out.println("1. Edit Profile");
			System.out.println("2. Add item to Food Log");
			System.out.println("4. Print Log");
			
			user.printProfile();
			System.out.print("What would you like to do: ");
			userOpt = input.nextInt(); 
			
			switch(userOpt){
				case 1:
					user.editProf();
					break;
				case 2:
					item.addEntry();
					break;
				case 4:
					item.printLog();
					break;
			}
		}
	}
}