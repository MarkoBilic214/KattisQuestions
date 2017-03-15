import java.util.Scanner;

public class Bjele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		scanner.close();
		int[] pieces = new int[input.length];
		
		for (int i =0; i<pieces.length;i++){
			pieces[i]=Integer.parseInt(input[i]);
	
		}
		for (int i=0;i<2;i++){
			if (pieces[i]>1)System.out.print(((pieces[i]-1)*-1)+" ");
			else if (pieces[i] < 0 )System.out.print(((pieces[i]-1)*-1)+ " ");
			else if (pieces[i]==0)System.out.print(1+" ");
			else System.out.print(0+" ");
		}
		for (int i =2;i<5;i++){
			if (pieces[i]>2)System.out.print(((pieces[i]-2)*-1)+" ");
			else if (pieces[i] < 0 )System.out.print(((pieces[i]-2)*-1)+ " ");
			else if (pieces[i]==1)System.out.print(1+" ");
			else if (pieces[i]==0)System.out.print(2+" ");
			else System.out.print(0+ " ");
		}
		
		if (pieces[5]>8)System.out.print(((pieces[5]-8)*-1)+" ");
		else if (pieces[5] < 0 )System.out.print(((pieces[5]-8)*-1)+" ");
		else if (pieces[5]<8 && pieces[5]>0)System.out.print(8-pieces[5]);
		else if (pieces[5]==0)System.out.print(8);
		else System.out.print(0);
		
		
	}

}
