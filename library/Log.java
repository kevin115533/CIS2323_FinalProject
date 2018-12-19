package library;
import java.util.*;

public class Log{
	private int count;
	int userOpt;
	String[] foodList = new String[30];
	
	
	Scanner input = new Scanner(System.in);
	
	public void addEntry(){
		count++;
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