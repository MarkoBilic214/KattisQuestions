import java.util.HashMap;
import java.util.Scanner;

public class Marko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char[] letters;
		HashMap<Character,char[]> map = new HashMap<Character,char[]>();
		letters=new char[3];
		letters[0]='a';letters[1]='b';letters[2]='c';
		map.put('2', letters);
		letters=new char[3];
		letters[0]='d';letters[1]='e';letters[2]='f';
		map.put('3', letters);
		letters=new char[3];
		letters[0]='g';letters[1]='h';letters[2]='i';
		map.put('4', letters);
		letters=new char[3];
		letters[0]='j';letters[1]='k';letters[2]='l';
		map.put('5', letters);
		letters=new char[3];
		letters[0]='m';letters[1]='n';letters[2]='o';
		map.put('6', letters);
		letters=new char[4];
		letters[0]='p';letters[1]='q';letters[2]='r';letters[3]='s';
		map.put('7', letters);
		letters=new char[3];
		letters[0]='t';letters[1]='u';letters[2]='v';
		map.put('8', letters);
		letters=new char[4];
		letters[0]='w';letters[1]='x';letters[2]='y';letters[3]='z';
		map.put('9', letters);
		
		int num=scanner.nextInt();
		scanner.nextLine();
		String[] words = new String[num];
		for (int i =0;i<num;i++){
			words[i]=scanner.nextLine();
		}
		String numberTyped= scanner.nextLine();
		scanner.close();
		int finalcount=0;
		for (String word: words){
			if (word.length()==numberTyped.length()){
				int amount=0;
				for (int i =0;i<numberTyped.length();i++){
					
					char[] keys =map.get(numberTyped.charAt(i));
					for (int j=0;j<keys.length;j++){
						if (word.charAt(i)==keys[j]){
							amount++;
							break;
						}
					}
					
				}
				if (numberTyped.length()==amount)finalcount++;
			}
			
		}
		System.out.println(finalcount);
		
	}

}
