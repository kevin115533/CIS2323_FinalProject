package library;
import java.util.*;

public class Profile{
	private int totalCal = 0;
	private int eatenCal = 0;
	private int eatenP = 0;
	private int totalP = 0;
	private int eatenC = 0;
	private int totalC = 0;
	private int eatenF = 0;
	private int totalF = 0;
	int userIn;
	
	Scanner input = new Scanner(System.in);
	
	public void editProf(){
		System.out.print("Enter your protein goals in grams: ");
		userIn = input.nextInt();
		setPro(userIn);
		System.out.print("Enter your carb goals in grams: ");
		userIn = input.nextInt();
		setCar(userIn);
		System.out.print("Enter your fat goals in grams: ");
		userIn = input.nextInt();
		setFat(userIn);
		setTotal();
	}
	
	public void setTotal(){
			totalCal = (totalP * 4) + (totalC * 4) + (totalF * 9);
	}
	
	public void setCar(int a){
			totalC = a;
	}
	
	public void setFat(int a){
			totalF = a;
	}
	
	public void setPro(int a){
			totalP = a;
	}
	
	public void printProfile(){
		System.out.println("========Daily Totals========");
		System.out.println("Total Protein:  " + eatenP + "/" + totalP);
		System.out.println("Total Carbs:    " + eatenC + "/" + totalC);
		System.out.println("Total Fats:     " + eatenF + "/" + totalF);
		System.out.println("Total Calories: " + eatenCal + "/" + totalCal);
	}

}