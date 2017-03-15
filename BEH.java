import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeSet;

public class BEH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		TreeSet<String> set= new TreeSet<String>();
		HashMap<String,food> map = new HashMap<String,food>();
		int testcase=1;
		
		
		while(true){
			testcase=scanner.nextInt();
			String dumb=scanner.nextLine();
			if(testcase==0)break;
			int i=0;
			while(i!=testcase){
				i+=1;
				String line=scanner.nextLine();
				String[]stuff=line.split(" ");
				for (int j=stuff.length-1;j>0;j--){
					if (!set.contains(stuff[j])||set.isEmpty()){
						set.add(stuff[j]);
						map.put(stuff[j], new food(stuff[j]));
						map.get(stuff[j]).addName(stuff[0]);
						
					}
					else {
						map.get(stuff[j]).addName(stuff[0]);
						
					}
					
				}
				
				
			}
			for (String s : set){
				System.out.print(s+" ");
				for (String p :map.get(s).names){
					System.out.print(p+" ");
				}
				System.out.println();
			}
			System.out.println();
			set.clear();
			map.clear();
			
			
		}
		scanner.close();
		
	}

}
class food {
	TreeSet<String> names;
	String name;
	
	public food(String nam){
		name=nam;
		names=new TreeSet<String>();
		
	}
	
	public void addName(String name){
		names.add(name);
		
	}
	public String getName(){
		return this.name;
	}
	
}