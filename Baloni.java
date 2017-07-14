import java.util.HashMap;
import java.util.Scanner;

public class Baloni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int num = scanner.nextInt();
		int cur;
		int count=0;
		for (int i =0;i<num;i++){
			cur=scanner.nextInt();
			if (map.get(cur)==null){
				map.put(cur, 1);
			}
			else{
				map.put(cur, map.get(cur)+1);
			}
			
			if (map.get(cur+1)==null||map.get(cur+1)==0){
				count++;
				
			}
			else{
				map.put(cur+1,map.get(cur+1)-1);
			}
					
		}
		scanner.close();
		System.out.println(count);
	}

}
