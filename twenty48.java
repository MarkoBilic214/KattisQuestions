
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class twenty48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		int[][] board = new int[4][4];
		int[][] resBoard = new int[4][4];
		int move =0;
		for (int j=0;j<4;j++){
			for (int i=0;i<4;i++){
				board[j][i]=scanner.nextInt();
				resBoard[j][i]=0;
			}
		}
		move=scanner.nextInt();
		scanner.close();
		if (move==0){
			for (int j=0;j<4;j++){	
				for (int i =0;i<4;i++){
					if (board[j][i]!=0)queue.add(board[j][i]);
				}
				queue=doMath(queue);
			
				int i=0;
				while (!queue.isEmpty()){
				resBoard[j][i]=queue.poll();
				i++;
				}
			}
		}
		
		else if (move==1){
			for (int j=0;j<4;j++){	
				for (int i =0;i<4;i++){
					if (board[i][j]!=0)queue.add(board[i][j]);
				}
				queue=doMath(queue);
			
				int i=0;
				while (!queue.isEmpty()){
				resBoard[i][j]=queue.poll();
				i++;
				}
			}
		}
		
		
		else if (move==2){
			for (int j=3;j>=0;j--){	
				for (int i =3;i>=0;i--){
					if (board[j][i]!=0)queue.add(board[j][i]);
				}
				queue=doMath(queue);
			
				int i=3;
				while (!queue.isEmpty()){
				resBoard[j][i]=queue.poll();
				i--;
				}
			}
		}
		
		else if (move==3){
			for (int j=3;j>=0;j--){	
				for (int i =3;i>=0;i--){
					if (board[i][j]!=0)queue.add(board[i][j]);
				}
				queue=doMath(queue);
			
				int i=3;
				while (!queue.isEmpty()){
				resBoard[i][j]=queue.poll();
				i--;
				}
			}
		}
				
		for (int j=0;j<4;j++){
			for (int i=0;i<4;i++){
				System.out.print(resBoard[j][i]+" ");
			}
			System.out.println("");
		}
	}
	public static Queue<Integer> doMath(Queue<Integer> queue){
		Queue<Integer> nQueue= new LinkedList<Integer>();
		while(!queue.isEmpty()){
			int pop = queue.poll();
			if (queue.peek()!=null&&pop==queue.peek()){
				nQueue.add(pop*2);
				pop=queue.poll();
			}
			else nQueue.add(pop);
		}
		return nQueue;
	}

}
