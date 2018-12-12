package library;
import java.util.*;

public class Profile{
	private int totalCal = 0;
	private int eatenCal = 0;
	private int eatenP = 0;
	private int totalP = 0;
	int userIn;
	Scanner input = new Scanner(System.in);
	
	public void editProf(){
		System.out.print("Enter your protein goals in grams: ");
		userIn = input.nextInt();
		setPro(userIn);
	}
	
	public void setTotal(){
			
	}
	
	public void setPro(int a){
			totalP = a;
	}
	
	public void printProfile(){
		System.out.println("========Daily Totals========");
		System.out.println("Total Protein:  " + eatenP + "/" + totalP);
		System.out.println("Total Calories: " + eatenCal + "/" + totalCal);
	}

}