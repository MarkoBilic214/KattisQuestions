import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class StackingCups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.nextLine();
		TreeSet<Integer> set = new TreeSet<Integer>();
		HashMap<Integer,String> map = new HashMap<Integer,String>(); 
		for (int i =0;i<num;i++){
			String[] stuff= scanner.nextLine().split(" ");
			if (isNumeric(stuff[0])){
				int number = Integer.parseInt(stuff[0])/2;
				set.add(number);
				map.put(number, stuff[1]);
			}
			else {
				int number = Integer.parseInt(stuff[1]);
				set.add(number);
				map.put(number, stuff[0]);
			}
		}
		scanner.close();
		for (int i : set){
			System.out.println(map.get(i));
		}
		
	}
	public static Boolean isNumeric(String word){
		try{
			int num=Integer.parseInt(word);
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
}
