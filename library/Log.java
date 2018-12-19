package library;
import java.util.*;

public class Log{
	private int count;
	int userOpt;
	Food[] foodList = new Food[30];
	
	
	Scanner input = new Scanner(System.in);
	
	public void addEntry(){
		foodList[count] = new Food();
		count++;
	}
	
	/*public void deleteEntry(){
		printLog();
		System.out.println("Which item do you want to remove: ");	
		userOpt = input.nextInt();
	}*/
	
	public void printLog(){
		for(int i = 0; i<count; i++){
			System.out.print((i+1));
			foodList[i].printFood();
		}
	}
}