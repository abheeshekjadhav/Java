package day2;
import java.util.Scanner;

public class ForloopExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente your name:");
		name = sc.next();
		
		for(int i =0 ; i <10;i++) {
			System.out.println("" + name + ":" +i);
			
		}
		
		

	}

}
