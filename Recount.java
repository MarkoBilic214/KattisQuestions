import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Recount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		HashMap<String,Nums> map = new HashMap<String,Nums>();
		while(true){
			String name= scanner.nextLine();
			if (name.equals("***"))break;
			if (!map.containsKey(name)){
				map.put(name, new Nums(1));
				
			}
			else map.get(name).add();
		}
		scanner.close();
		System.out.println(max(map));
		
	}
	public static String max(HashMap<String, Nums> map){
		String name="";
		ArrayList<String> names= new ArrayList<String>();
		int max=0;
		for (String s : map.keySet()){
			if (map.get(s).num>max){
				max=map.get(s).num;
				name =s;
			}
			else if(map.get(s).num==max)names.add(s);
		}
		int set=0;
		for (String nam : map.keySet()){
			if (map.get(nam).num==max)set+=1;
		}
		if (set>1)return "Runoff!";
		
		return name;
	}
}
class Nums{
	int num;
	public Nums(int bum){
		num=bum;
		
	}
	public void add(){
		num+=1;
	}
	
}