/*
*please not that this code works for all the sample files given by kattis but failed on the fifth problem given
*
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeSet;

public class Zagrade {
	static ArrayList<Integer> left;
	static ArrayList<Integer> right;
	static TreeSet<String> set;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char[] exp = scanner.next().toCharArray();
		scanner.close();
		Stack<Integer> stack= new Stack<Integer>();
		left= new ArrayList<Integer>();
		right= new ArrayList<Integer>();
		set = new TreeSet<String>();
		for (int i=0;i<exp.length;i++){
			if (exp[i]=='(')stack.push(i);
			else if (exp[i]==')'){
				left.add(stack.pop());
				right.add(i);
			}
		}
	
		boolean[] check = new boolean[left.size()];
		recurse(exp,check);
		for (String s: set){
			System.out.println(s);
		}
	
	}
	private static void recurse(char[] word,boolean[] test){
		for (int i =0;i<test.length;i++){
			if (!test[i]){
				boolean[] nuf = test.clone();
				nuf[i]=true;
				char[] meh = word.clone();
				meh[left.get(i)]=' ';
				meh[right.get(i)]=' ';
				String some= new String(meh);
				set.add(some.replaceAll("\\s+",""));
				recurse(meh,nuf);
			}
		}
		
	}

}
