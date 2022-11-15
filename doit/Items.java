package doit;

import java.util.Stack;

public class Items {
	private int x;
	private int y;
	private int dir;
	
	public Items() {
		super();
		this.x = 0;
		this.y = 0;
		this.dir = 0;
	}

	public Items(int x, int y, int dir) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}
	
	public void ToString(){
		System.out.println(x+","+y+","+dir);
	}
	
	public void Path(int[][] maze, int[][] mark, Offsets[] move, int m, int p) {
		
		mark[1][1] = 1;
		Stack<Items> stack = new Stack<>();
		Items temp = new Items(1,1,0);//1,1,E
		
		stack.push(temp);
		
		while(!stack.isEmpty()) {
			Items tmp=stack.pop();
			
			int i = tmp.getX();
			int j = tmp.getY();
			int d = tmp.getDir();
			
			while(d<8) {
				int g = i + move[d].getA();
				int h = j + move[d].getB();
				
				if((g == m) && (h == p)) {
					System.out.println(stack);
					System.out.println("the term near the exit"+ i +" "+ j);
					System.out.println("exit:"+ m +" "+ p);
					return;
				}
				if((maze[g][h] == 0) && (mark[g][h] == 0)) {
					mark[g][h] = 1;
					Items tp = new Items(i, j, d+1);
					stack.push(tp);
					i = g;
					i = h;
					d = 0;
				}
				else d++;
			}
			
		}
		System.out.println("no path in maze");
	}
}
