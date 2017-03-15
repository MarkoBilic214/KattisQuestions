import java.util.Scanner;

public class rijeci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num= scanner.nextInt();
		scanner.close();
		int a = 1;
		int b = 0;
		int prev = 0;
		for (int i = 0;i<num;i++){
			prev=b;
			b+=a;
			a=prev;
		}
		System.out.println(a+" "+b);
	}

}
//A -> B  0 1
//B -> BA 1 1
//BA -> BAB 1 2
//BAB -> BABBA 2 3
//BABBA -> BABBABAB 3 5