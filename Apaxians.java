import java.util.Scanner;

public class Apaxians {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String string = scanner.nextLine();
		scanner.close();
		System.out.print(string.charAt(0));
		char prev = string.charAt(0);
		for (int i =0;i<string.length();i++){
			if (string.charAt(i)!=prev){
				System.out.print(string.charAt(i));
				prev=string.charAt(i);
			}
			
		}
	}

}
