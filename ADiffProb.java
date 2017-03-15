import java.math.BigInteger;
import java.util.Scanner;

public class ADiffProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		while (scanner.hasNext()){
			BigInteger num1= scanner.nextBigInteger();
			BigInteger num2= scanner.nextBigInteger();
			BigInteger sub= num1.subtract(num2);
			if (sub.signum()==-1){
				System.out.println(sub.negate());
			}
			else System.out.println(sub);
		}
		scanner.close();
		
	}

}
