package library;
import java.util.*;

public class Log{
	private int count;
	String userIn;
	int userAmount, userOpt;
	String[] foodList = new String[30];
	int[] listP = new int [30];
	int[] listC = new int [30];
	int[] listF = new int [30];
	
	Scanner input = new Scanner(System.in);
	
	public void addEntry(){
		System.out.print("Enter item name: ");
		userIn = input.nextLine();
		foodList[count] = new String(userIn);
		
		System.out.print("Enter protein value: ");
		userAmount = input.nextInt();
		listP[count] = userAmount;
		
		System.out.print("Enter carb value: ");
		userAmount = input.nextInt();
		listC[count] = userAmount;
		
		System.out.print("Enter fat value: ");
		userAmount = input.nextInt();
		listF[count] = userAmount;
		
		count++;
		input.nextLine();
	}
	
	public void deleteEntry(){
		printLog();
		System.out.println("Which item do you want to remove: ");	
		userOpt = input.nextInt();
	}
	
	public void printLog(){
		for(int i = 0; i<count; i++){
			System.out.println( (i+1) + "." +foodList[i] +
							  "  Pro: " + listP[i] + "g" +
							  "  Car: " + listC[i] + "g" +
							  "  Fat: " + listF[i] + "g" );
		}
	}
	
}