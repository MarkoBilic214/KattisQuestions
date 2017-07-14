import java.util.HashMap;
import java.util.Scanner;
public class DigitalDisplay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, String[]> map = new HashMap<Character,String[]>();
		Scanner scanner = new Scanner(System.in);
		String[] zero = {"+---+","|   |","|   |","+   +","|   |","|   |","+---+"};
		String[] one = {"    +","    |","    |","    +","    |","    |","    +"};
		String[] two = {"+---+","    |","    |","+---+","|    ","|    ","+---+"};
		String[] three= {"+---+","    |","    |","+---+","    |","    |","+---+"};
		String[] four = {"+   +","|   |","|   |","+---+","    |","    |","    +"};
		String[] five = {"+---+","|    ","|    ","+---+","    |","    |","+---+"};
		String[] six = {"+---+","|    ","|    ","+---+","|   |","|   |","+---+"};
		String[] sev = {"+---+","    |","    |","    +","    |","    |","    +"};
		String[] eight= {"+---+","|   |","|   |","+---+","|   |","|   |","+---+"};
		String[] nine = {"+---+","|   |","|   |","+---+","    |","    |","+---+"};
		map.put('0', zero);
		map.put('1', one);
		map.put('2', two);
		map.put('3', three);
		map.put('4', four);
		map.put('5', five);
		map.put('6', six);
		map.put('7', sev);
		map.put('8', eight);
		map.put('9', nine);
		
		String time =  "";
		while(true){
			time = scanner.nextLine();
			if(time.equals("end")){
				System.out.println("end");
				break;
			}
			String[][] numbers = {map.get(time.charAt(0)),map.get(time.charAt(1)),map.get(time.charAt(3)),map.get(time.charAt(4))};
			for(int i =0;i<7;i++){
				if (i == 2 || i ==4){
					System.out.println(numbers[0][i]+"  "+numbers[1][i]+"  "+"o"+"  "+numbers[2][i]+"  "+numbers[3][i]);
				}
				else{
					System.out.println(numbers[0][i]+"  "+numbers[1][i]+"     "+numbers[2][i]+"  "+numbers[3][i]);
				}
			}
			System.out.println();
			System.out.println();
			
		}
		scanner.close();
		
	}

}
