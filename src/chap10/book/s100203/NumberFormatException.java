package chap10.book.s100203;

public class NumberFormatException {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		//data2의 문자열은 숫자로 변환할 수 없음

		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}
