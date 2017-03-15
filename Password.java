import java.util.Scanner;
import java.util.ArrayList;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> set = new ArrayList<Character>();
		Scanner scanner =new Scanner(System.in);
		String pass= scanner.next();
		String attempt =scanner.next();
		scanner.close();
		for (int i =0;i<pass.length();i++){
			set.add(pass.charAt(i));
			
		}
		
		if (Pass(set,attempt,pass))System.out.println("PASS");
		else System.out.println("FAIL");
	}
	public static boolean Pass(ArrayList<Character> set, String attempt, String pass){
		ArrayList<Character> array = new ArrayList<Character>(set);
		for (int i =0; i<attempt.length();i++){
			if (set.contains(attempt.charAt(i))&&array.get(0)==attempt.charAt(i)){
				array.remove(0);
				set.remove(set.indexOf(attempt.charAt(i)));
			}
			else if (set.contains(attempt.charAt(i))&&array.get(0)!=attempt.charAt(i)){
				return false;
			}
			
			
		}
		if(!set.isEmpty())return false;
		return true;
	}

}
