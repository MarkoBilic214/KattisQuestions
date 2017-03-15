import java.util.Scanner;

public class Aaaaah {

	public static void main(String[] args) {
		// TODO Auto-generatesd method stub
		Scanner scanner = new Scanner(System.in);
		String line1= scanner.next();
		String line2= scanner.next();
		scanner.close();
		if(line1.length()>line2.length()||line1.length()==line2.length())System.out.println("go");
		else System.out.println("no");
	}

}
