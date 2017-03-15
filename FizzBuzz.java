import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		scanner.close();
		String[] arg= line.split(" ");
		int[] nums = new int[arg.length];
		
		for (int i = 0; i< arg.length;i++){
			nums[i]=Integer.parseInt(arg[i]);
		}
		for (int i = 1;i<=nums[2];i++){
			if (i%nums[0]==0&&i%nums[1]==0)System.out.println("FizzBuzz");
			else if (i%nums[0]==0)System.out.println("Fizz");
			else if (i%nums[1]==0)System.out.println("Buzz");
			else System.out.println(i);
		}
	}

}
