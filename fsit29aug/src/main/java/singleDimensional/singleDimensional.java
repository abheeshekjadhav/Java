package singleDimensional;

import java.util.Scanner;

public class singleDimensional {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArr[] = new int[5];
		int myArr1[] = {1,2,3,4};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <myArr.length;i++) {
			System.out.print("Enter value of array at index :" + i);
			int ind = sc.nextInt();
			
		    myArr[i] = ind;
		    
			System.out.println(myArr[i]);
		}

	}

}
