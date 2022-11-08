package doit;
import java.util.Stack;

public class ex1 {
	public static void SolveQueen(int[][] d) {
//		int mode = 0;
		int count = 0;
		int cnt = 0;
		int ix = 0, iy = 0;
		Stack<Point> st = new Stack<>();
		Point p = new Point(ix, iy);
		d[ix][iy] = 1; 
		count++;
		st.push(p);
		
		while (count < d.length) {
			ix++;	iy = 0;	
			while (iy < d.length)	{
				while (iy < d[0].length) {
					System.out.println("count = " + count + "ix = "+ix + "iy = " + iy);
					if(CheckMove(d, ix, iy)) {
						p = new Point(ix, iy);
						st.push(p);
						count++;
						d[ix][iy] = 1;
						break;
					}
					iy++;
				}
//				if (count == d.length) {
//					System.out.printf(st.toString());
//					cnt++;
//					System.out.println(cnt);
//					ix = d[0].length;
//				}
//				if(count == 0) {
//					return;
//				}
				if(iy !=d[0].length) {
					break;
				} else {
//					ix=st.peek().getX();
//					iy=st.peek().getY();

					p = st.pop();
					ix = p.getX();
					iy = p.getY();
					d[ix][iy] = 0;
					iy++;
					count--;
				}
			}
		}
	}

	public static boolean checkRow(int[][] d, int crow) {
		for(int i = 0; i < d.length; i++)
			if(d[i][crow] == 1)	return false;
		return true;
	}

	
	public static boolean checkCol(int[][] d, int ccol) {
		for(int i = 0; i < d[0].length; i++)
			if(d[ccol][i] == 1)	return false;
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int cx, int cy) { //x++, y-- or x--, y++ where 0<= x,y <= 7
		while(true) {
			cx++;
			cy--;
			if(cx >= d.length || cy < 0) break;
			if(d[cx][cy] == 1)	return false;
		}
		while(true) {
			cx--;
			cy++;
			if(cy >= d.length || cx < 0) break;
			if(d[cx][cy] == 1)	return false;
		}
		return true;
	}

	public static boolean checkDiagSE(int[][] d, int cx, int cy) {//x++, y++ or x--, y--
		while(true) {
			cx--;
			cy--;
			if(cx < 0 || cy < 0) break;
			if(d[cx][cy] == 1)	return false;
		}
		while(true) {
			cx++;
			cy++;
			if(cy >= d.length || cx>=d.length) break;
			if(d[cx][cy] == 1)	return false;		
		}
		return true;
	}
    public static boolean CheckMove(int[][]d, int x, int y) {//(x,y)로 이동 가능한지를 check
    	if(checkRow(d, y) && checkCol(d, x) && checkDiagSW(d,x,y) && checkDiagSE(d,x,y))	return true;
    	return false;
    }
    public static boolean NextMove(int[][]d, int row, int col) {//다음 row에 대하여 이동할 col을 조사
    	
    	return true;
    }
	public static void main(String[] args) {
		int row = 8;
		int col = 8;
		int[][] data = new int[row][col];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		SolveQueen(data);
		
		//print queen
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}