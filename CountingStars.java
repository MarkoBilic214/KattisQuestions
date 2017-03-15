import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountingStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int testcase =0;
		Queue<item> queue = new LinkedList<item>(); 
		while (scanner.hasNext()){
			int stars=0;
			testcase+=1;
			int y=scanner.nextInt();
			int x =scanner.nextInt();
			scanner.nextLine();
			char[][] matrix = new char[y][x];
			for (int j=0;j<y;j++){
				String line =scanner.nextLine();
				for (int i=0;i<x;i++){
					matrix[j][i]=line.charAt(i);
				}
			}
			for (int j=0;j<y;j++){
				for (int i=0;i<x;i++){
					if (matrix[j][i]=='-'){
						queue.add(new item(j,i));
						stars+=1;
						matrix[j][i]='$';
						while(!queue.isEmpty()){
							item thing =queue.poll();
							if (thing.x+1<x && matrix[thing.y][thing.x+1]=='-'){
								matrix[thing.y][thing.x+1]='$';
								queue.add(new item(thing.y,thing.x+1));
							}
							if (thing.x-1>-1 && matrix[thing.y][thing.x-1]=='-'){
								matrix[thing.y][thing.x-1]='$';
								queue.add(new item(thing.y,thing.x-1));
							}
							if (thing.y+1<y && matrix[thing.y+1][thing.x]=='-'){
								matrix[thing.y+1][thing.x]='$';
								queue.add(new item(thing.y+1,thing.x));
							}
							if (thing.y-1>-1 && matrix[thing.y-1][thing.x]=='-'){
								matrix[thing.y-1][thing.x]='$';
								queue.add(new item(thing.y-1,thing.x));
							}
						}
						
						
					}
				}
			}
			
			System.out.println("Case "+testcase+": "+stars);
			
		}
		scanner.close();
	}

}
class item{
	int x;
	int y;
	public item(int y,int x){
		this.x=x;
		this.y=y;
	}
}
