package chap05.lecture;

public class C01EnhancedFor {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			System.out.println("그냥 for");
		}
		
		int[] arr1 = {100,200,300,400};
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int item : arr1) { // item 에  arr1[0] 부터 순서대로 입력된다 
			System.out.println(item);
		}
	}
}
