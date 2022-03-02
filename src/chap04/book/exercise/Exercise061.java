package chap04.book.exercise;

public class Exercise061 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		// 문제
		// *****
		// ****
		// ***
		// **
		// *
		for(int i=5; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		//*****
		// ****
		// 	***
		//   **
		//    *
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=5-i; k>0; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		for(int i=0; i<5; i++) {
			for(int j=4-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("---------------------");
		
	}
}
