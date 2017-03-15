import java.util.Scanner;

public class coldputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine());
		String shit = scanner.nextLine();
		String[] nums = shit.split(" ");	
		scanner.close();
		int count =0;
		for (int i = 0;i <num;i++){
			if (Integer.parseInt(nums[i])<0)count+=1; 
		}
		
		System.out.println(count);
	}

}
