import java.util.Scanner;
import java.util.TreeSet;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i =0;i<3;i++)set.add(scanner.nextInt());
		Object[] nums=set.toArray();
		scanner.nextLine();
		String letters= scanner.nextLine();
		scanner.close();
		for (int i=0;i<letters.length();i++){
			if (letters.charAt(i)=='A')System.out.print(nums[0]+" ");
			else if (letters.charAt(i)=='B')System.out.print(nums[1]+" ");
			else System.out.print(nums[2]+" ");
		}
		
		
	}

}
