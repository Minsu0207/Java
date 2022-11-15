package doit;

import java.util.Stack;

public class Backtracking_Queen {
	public static void SolveQueen(int[][] d) {
		// int mode = 0;
		int count = 0;
		int cnt = 0;
		int ix = 0, iy = 0;
		Stack<Point> st = new Stack<>();
		Point p = new Point(ix, iy);
		d[ix][iy] = 1;
		count++;
		st.push(p);

		while (count < d.length) {
			ix++;    iy = 0;
			while (ix < d.length) {
				while (iy < d[0].length) {
					int nextCol = NextMove(d, ix, iy);
					iy = nextCol;
					System.out.println("count = " + count + " ix = " + ix + " iy = " + iy);

					if (iy <= 0 && iy < d.length) {
						p = new Point(ix, iy);
						st.push(p);
						count++;
						d[ix][iy] = 1;
						break;
						}
					}

					if (iy != -1) {
						break;
					} else {
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
		for (int i = 0; i < d.length; i++)
			if (d[i][crow] == 1)
				return false;
		return true;
	}

	public static boolean checkCol(int[][] d, int ccol) {
		for (int i = 0; i < d[0].length; i++)
			if (d[ccol][i] == 1)
				return false;
		return true;
	}

	public static boolean checkDiagSW(int[][] d, int x, int y) { // x++, y-- or x--, y++ where 0<= x,y <= 7
		int cx = x, cy = y;
		while (true) {

			if (cx >= d.length || cy < 0)
				break;
			if (d[cx][cy] == 1)
				return false;
			cx++;
			cy--;
		}
		cx = x;
		cy = y;
		while (true) {

			if (cy >= d.length || cx < 0)
				break;
			if (d[cx][cy] == 1)
				return false;
			cx--;
			cy++;
		}
		return true;
	}

	public static boolean checkDiagSE(int[][] d, int x, int y) {// x++, y++ or x--, y--
		int cx = x, cy = y;
		while (true) {
			cx--;
			cy--;
			if (cx < 0 || cy < 0)
				break;
			if (d[cx][cy] == 1)
				return false;
		}
		cx = x;
		cy = y;
		while (true) {
			cx++;
			cy++;
			if (cy >= d.length || cx >= d.length)
				break;
			if (d[cx][cy] == 1)
				return false;
		}
		return true;
	}

	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check
		if (checkRow(d, x) && checkCol(d, y) && checkDiagSW(d, x, y) && checkDiagSE(d, x, y))
			return true;
		return false;
	}

	public static int NextMove(int[][] d, int row, int col) {// 다음 row에 대하여 이동할 col을 조사
		int cx = col;
		while (cx < d.length) {
			if (CheckMove(d, row, cx))
				return cx;
			cx++;
		}
		return -1;
	}

	public static void main(String[] args) {
		int row = 8;
		int col = 8;
		int[][] data = new int[row][col];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		SolveQueen(data);

		// print queen
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}