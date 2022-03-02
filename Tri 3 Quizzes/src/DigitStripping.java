
public class DigitStripping {

	public static void main(String[] args) {

		System.out.println(strip(-56));
		
	}
	
	public static int strip(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
