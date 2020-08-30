package pattern;
import java.util.Scanner;


public class lotusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name:  ");
		
		name = sc.next();
		
		for(int row =0 ; row <name.length() ; row++) {
			for(int col = 0 ; col <=row ; col++) {
				System.out.print(name.charAt(col));
			}
			System.out.println();
		}
				
		sc.close();		

	}

}
