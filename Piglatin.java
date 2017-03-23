
import java.util.Scanner;
import java.util.TreeSet;

public class Piglatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		TreeSet<Character> map = new TreeSet<Character>();
		map.add('a');
		map.add('e');
		map.add('i');
		map.add('o');
		map.add('u');
		map.add('y');
		while (scanner.hasNext()){
			String[] cur = scanner.nextLine().split(" ");
			for (int i=0;i<cur.length;i++){
				if (map.contains(cur[i].charAt(0))){
					System.out.print(cur[i]+"yay ");
				}
				else{
					String end=""+cur[i].charAt(0);
					int count=1;
					while (!map.contains(cur[i].charAt(count))){
						end+=""+cur[i].charAt(count);
						count++;
					}
					System.out.print(cur[i].substring(count)+end+"ay ");
				}
			}
			System.out.println();
			
					
		}
		scanner.close();
	}

}
