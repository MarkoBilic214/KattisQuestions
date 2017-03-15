

import java.util.Scanner;
import java.util.HashSet;
public class IBeenEveryWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt();
		
		for (int i = 0; i < testcase; i++){
			int testnum = scanner.nextInt();
			for (int j = 0; j < testnum;j++ ){
				String place = scanner.next();
				set.add(place);
				
				
			}
			System.out.println("");
			System.out.println(set.size());
			set.clear();
		}
		scanner.close();
		
	}

}
