package library;
import java.util.*;

public class Food{
	private String name = "";
	private int protein = 0;
	private int carbs = 0;
	private int fat = 0;
	String userIn;
	int userAmount;
	Scanner input = new Scanner(System.in);
	
	public Food(){
		setName();
		setPro();
		setCar();
		setFat();
	}
	
	public void setName(){
		System.out.print("Enter item name: ");
		userIn = input.nextLine();
		name = userIn;	
	}
	
	public void setPro(int a){
		System.out.print("Enter protein value: ");
		userAmount = input.nextInt();
		protein = (userAmount * 4);	
	}
	
	public void setCar(int a){
		System.out.print("Enter carb value: ");
		userAmount = input.nextInt();
		carbs = (userAmount * 4);	
	}
	
	public void setFat(int a){
		System.out.print("Enter fat value: ");
		userAmount = input.nextInt();
		fat = (userAmount * 9);
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
	
	public String getName(){
		return name;	
	}
	
	
}
