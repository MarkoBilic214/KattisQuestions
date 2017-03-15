import java.util.Scanner;

public class Stats1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testcase =0;
		int max=0;
		int min=0;
		int range=0;
		
		
		while (scanner.hasNextInt()){
			
			testcase+=1;
			int num = scanner.nextInt();
			int[] nums = new int[num];
			for (int i =0;i<num;i++){
				nums[i]= scanner.nextInt();
			}
			max=max(nums);
			min=min(nums);
			range=max-min;
			System.out.println("Case "+testcase+": "+min+" "+max+" "+range);
			
			
		}
		
		scanner.close();
		
	}
	
	public static int min(int[] array){
		int min = array[0];
		for (int i = 1;i <array.length;i++){
			if (array[i]<min)min=array[i];
		}
		return min;
	}

	
	public static int max(int[] array){
		int max = array[0];
		for (int i = 1;i <array.length;i++){
			if (array[i]>max)max=array[i];
		}
		return max;
	}
	

}


