import java.lang.Math;
public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i<=100; i++) {
			boolean multiple = false;
			
			double end = Math.sqrt(i);
			
			for (int j = 2; j < end; j++) {
				if (i%j == 0) {
					multiple = true;
					break;
				}
			}
			if (multiple == false) {
				System.out.println(i + " is a prime!");
			}

		}

	}

}
