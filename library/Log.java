package library;
import java.util.*;

public class Log{
	private int count;
	String userIn;
	String[] foodList = new String[30];
	Scanner input = new Scanner(System.in);
	
	public void addEntry(){
		System.out.print("Enter item name: ");
		userIn = input.nextLine();
		foodList[count] = new String(userIn);
		count++;
		
	}
	
	public void printLog(){
		for(int i = 0; i<count; i++){
			System.out.println( (i+1) + "." +foodList[i]);
		}
	}
	
}