import java.util.Scanner;

public class yoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String num1 = scanner.next();
		String num2 = scanner.next();
		scanner.close();
		String nnum1="";
		String nnum2="";
		String smaller;
		String yoda= "YODA";
		long finnum1=0;
		long finnum2=0;
		int dif=0;
		
		if (num1.length()<num2.length()){
			smaller = num1;
			dif = num2.length()-num1.length();
			nnum2=num2.substring(0, dif);
			num2=num2.substring(dif);
		}
		else {
			smaller =num2;
			dif = num1.length()-num2.length();
			nnum1= num1.substring(0, dif);
			num1=num1.substring(dif);
		}
		for (int i =0;i<num1.length();i++){
			if (num1.charAt(i)<num2.charAt(i))nnum2+=num2.charAt(i);
			else if (num1.charAt(i)==num2.charAt(i)){
				nnum1+=num1.charAt(i);
				nnum2+=num1.charAt(i);
			}
			else nnum1+=num1.charAt(i);
		}
		if (nnum1.isEmpty())nnum1=yoda;
		else if (nnum2.isEmpty())nnum2=yoda;
	
		System.out.println(nnum1.replaceFirst("^0+(?!$)", ""));
		System.out.println(nnum2.replaceFirst("^0+(?!$)", ""));
		
	}

}
