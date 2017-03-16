import java.util.Scanner;
import java.util.HashMap;


public class BabelFish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<String,String>(); 
		while (true){
		String line = scanner.nextLine();
		if(line.isEmpty())break;
		String[] strings = line.split(" ");
		//System.out.println(strings.length);
		map.put(strings[1],strings[0]);
		}
		while(scanner.hasNext()){
			String key = scanner.next();
			if (map.containsKey(key))System.out.println(map.get(key));
			else{
				System.out.println("eh");
			}
		}
		scanner.close();
	}

}
