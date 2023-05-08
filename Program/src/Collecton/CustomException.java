package Collecton;

import java.util.Scanner;

class AgeNotValidException extends Exception{
	public AgeNotValidException(String str){
		super(str);
	}
}

public class CustomException {
	
	static void validate(int age) throws AgeNotValidException{
		if(age<18) {
			throw new AgeNotValidException("Not eligible for vote");
		}
		else {
			System.out.println("Eligible for vote");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age: ");
		int n=sc.nextInt();
		
		try {
			validate(n);
		}
		catch(AgeNotValidException an) {
			System.out.println("exception cought");
			System.out.println("Custom Exception: "+an);
		}
		
		System.out.println("Remaining program");
	}

}
