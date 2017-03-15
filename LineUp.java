import java.util.ArrayList;
import java.util.Scanner;

public class LineUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		int num = scanner.nextInt();
		scanner.nextLine();
		for (int i =0;i < num;i++){
			array.add(scanner.nextLine());
		}
		scanner.close();
		if (Increasing(array))System.out.println("INCREASING");
		else if (Decreasing(array))System.out.println("DECREASING");
		else System.out.println("NEITHER");
		
		
	}
	public static Boolean Increasing(ArrayList<String> array){
		for (int i =1;i<array.size();i++){
			if (array.get(i-1).compareTo(array.get(i))>0)return false;
		}
		return true;
	}
	public static Boolean Decreasing(ArrayList<String> array){
		for (int i =1;i<array.size();i++){
			if (array.get(i-1).compareTo(array.get(i))<0)return false;
		}
		return true;
	}
}
