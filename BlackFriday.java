import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class BlackFriday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> array = new ArrayList<Integer>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		int testcase= scanner.nextInt();
		for (int i = 0; i<testcase;i++){
			
			
			int num=scanner.nextInt();
			if (!array.contains(num)||i==0){
				set.add(num);
				map.put(num,i+1 );
				array.add(num);
			}
			else{
				set.remove(num);
			}
			
			
		}
		scanner.close();
		if (set.isEmpty())System.out.println("none");
		else{
			int max =set.first();
			for (int i : set){
				if(i>max)max=i;
			}
			System.out.println(map.get(max));
		}
		
		
 
	}

}
