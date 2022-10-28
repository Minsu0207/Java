package stack;

class Offsets {
	int a = 0, b = 0;

	public Offsets(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
}

public class MazingProblem {

	enum directions {
		N, NE, E, SE, S, SW, W, NW  // 자바에선 그냥 숫자로 0~7
	}; 

	static Offsets moves[] = new Offsets[8];

	public static void path(int[][] maze, int[][] mark, int ix, int iy) {

		mark[1][1] = 1; // 시작점
		StackList st = new StackList(50);
		Items temp = new Items(0, 0, 0);
		temp.ix = 1;
		temp.iy = 1;
		temp.dir = 2;
		st.push(temp);
		System.out.println("초기:: " + temp.toString());

		while (!st.isEmpty()) // stack not empty
		{
	
			Items tmp = st.pop();
			int i = tmp.ix;
			int j = tmp.iy;
			int d = tmp.dir;
			
			while (d < 8) // moves forward
			{
				int g =i + moves[d].a;
				int h =j + moves[d].b;
				
//				System.out.println(i + " " + j + " " + d);
				if ((g == ix) && (h == iy)) { // reached exit
												// output path
					System.out.println("the term near the exit: " + i + " " + j);
					System.out.println("exit: " + ix + " " + iy);
					return;
				}
				if ((maze[g][h] == 0) && (mark[g][h] == 0)) { // new position
					mark[g][h]=1;   // ?
					Items tp = new Items(0,0,0);
					tp.ix=i;
					tp.iy=j;
					tp.dir=d+1;
					st.push(tp);
					i=g;
					j=h;
					d=0;
				} else
					d++; // try next direction
			}
			mark[i][j] = 0;
			
		}
		System.out.println("no path in maze ");
	}

	public static void main(String[] args) {
		int[][] maze = new int[100][100];
		int[][] mark = new int[100][100];

//	void path(int m, int p)
//		// Output a path (if any) in the maze; rows is m, cols is p;
//		 {
//		start at (1,1)
//		mark[1][1] = 1;
//		Stack<items> stack(m * p);
//		items temp;
//		temp.x = 1; temp.y = 1; temp.dir = E;
//		stack.Push(temp);
//		
//		while (!stack.IsEmpty()) // stack not empty
//		{
//			temp = stack.Pop(); // unstack
//			int i = temp.x; int j = temp.y; int d = temp.dir;mark[i][j] = 0;
//			while (d < 8) // moves forward
//			{
//				//outFile << i << " " << j << " " << d << endl;
//				int g = i + moves[d].a;
//				int h = j + moves[d].b;
//				if ((g == m) && (h == p)) { // reached exit
//											// output path
//					cout << stack;
//		
//					cout << "the term near the exit: " << i << " " << j << endl;
//					cout << "exit: " << m << " " << p << endl;
//					return;
//				}
//				if ((!maze[g][h]) && (!mark[g][h])) { // new position
//					mark[g][h] = 1;
//					//push the old temp to the stack, but the direction changes.
//					//Because the neighbor in the direction of d has been checked.
//					temp.x = i;  temp.y = j; temp.dir = d + 1;
//					stack.Push(temp); // stack it
//					i = g; j = h; d = N; // moves to (g,h)
//				}
//				else d++; // try next direction
//			}
//		}
//		cout << "no path in maze " << endl;
		// }
		/// *
		// maze[][], mark[][]를 class의 private data member로 선언
		// main()에서는 class의 public function의 호출로 미로 찾기
		// */
		// void main() {

		int input[][] = { // 12 x 15
				{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
				{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 },
				{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 },
				};
		for (int ia = 0; ia < 8; ia++)
			//[i] i는 방향  a b 는 x y 값 좌표
			moves[ia] = new Offsets(0, 0);
		moves[0].a = -1;
		moves[0].b = 0;
		moves[1].a = -1;
		moves[1].b = 1;
		moves[2].a = 0;
		moves[2].b = 1;
		moves[3].a = 1;
		moves[3].b = 1;
		moves[4].a = 1;
		moves[4].b = 0;
		moves[5].a = 1;
		moves[5].b = -1;
		moves[6].a = 0;
		moves[6].b = -1;
		moves[7].a = -1;
		moves[7].b = -1;

		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 17; j++) {
				if ((i == 0) || (j == 0) || (i == 13) || (j == 16))
					maze[i][j] = 1;
				else {
					maze[i][j] = input[i - 1][j - 1];
				}
				mark[i][j] = 0;

			}
		}
		System.out.println("maze[12,15]::");
		for (int i = 0; i <= 13; i++) {
			for (int j = 0; j <= 16; j++) {
				System.out.print(maze[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("mark::");
		for (int i = 0; i <= 13; i++) {
			for (int j = 0; j <= 16; j++) {
				System.out.print(mark[i][j] + " ");

			}
			System.out.println();
		}
		path(maze, mark, 12, 15);
		System.out.println("mark::");
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 15; j++) {
				System.out.print(mark[i][j] + " ");

			}
			System.out.println();
		}

	}
}