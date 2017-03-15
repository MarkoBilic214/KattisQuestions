import java.util.Scanner;

public class SimonSays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testcase = Integer.parseInt(scanner.nextLine());
		for (int i =0;i < testcase;i++){
			String line = scanner.nextLine();
			if (line.startsWith("Simon says")){
				System.out.println(line.substring(11));
			}
		}
		
		scanner.close();
	}

}
