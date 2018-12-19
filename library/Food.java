package library;
import java.util.*;

public class Food{
	private String name = "";
	private int protein = 0;
	private int carbs = 0;
	private int fat = 0;
	private int calories = 0;
	String userIn;
	int userAmount;
	Scanner input = new Scanner(System.in);
	
	public Food(){
		setName();
		setPro();
		setCar();
		setFat();
		setCal();
	}
	
	public void setName(){
		System.out.print("Enter item name: ");
		userIn = input.nextLine();
		name = userIn;	
	}
	
	public void setPro(){
		System.out.print("Enter protein value: ");
		userAmount = input.nextInt();
		protein = userAmount;	
	}
	
	public void setCar(){
		System.out.print("Enter carb value: ");
		userAmount = input.nextInt();
		carbs = userAmount;	
	}
	
	public void setFat(){
		System.out.print("Enter fat value: ");
		userAmount = input.nextInt();
		fat = userAmount;
	}
	
	public void setCal(){
		calories = (protein * 4) + (carbs * 4) + (fat * 9);
	}
	
	public int getPro(){
		return protein;	
	}
	
	public int getCar(){
		return carbs;	
	}
	
	public int getFat(){
		return fat;	
	}
	
	public int getCal(){
		return calories;	
	}
	
	public String getName(){
		return name;	
	}
	
	public void printFood(){
		System.out.println("." + getName() +
							"  Pro: " + getPro() + "g" +
							"  Car: " + getCar() + "g" +
							"  Fat: " + getFat() + "g" +
						    "  Calories: " + getCal());
	}
	

}
