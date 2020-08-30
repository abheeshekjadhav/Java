package pattern;
import java.util.Scanner;


public class nestedForpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of Rows:");
		int row = Integer.parseInt(sc.next());
		
		for(int i = 1 ; i <= row ; i++) {
			for (int col=1 ; col <=i ; col++ ) {
				System.out.print(col);
			}
			System.out.println();
		}
		
        sc.close();
	}

}
