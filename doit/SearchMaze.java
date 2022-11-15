package doit;

public class SearchMaze {
	
	public static void PrintMaze(int[][] map) {
		for(int n=0; n<=13; n++) {
			for(int m=0; m<=16; m++)	System.out.print(map[n][m]+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = new int[14][17];
		int[][] mark = new int[14][17];
		Items items = new Items();
		
		int[][] input = {{0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1},
						 {1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1},
						 {0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1},
						 {1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0},
						 {1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1},
						 {0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
						 {0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
						 {0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
						 {0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1},
						 {1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0},
						 {0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0},
						 {0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0}};
		
		Offsets[] moves = new Offsets[8];
		moves[0] = new Offsets(-1,0);
		moves[1] = new Offsets(-1,1);
		moves[2] = new Offsets(0,1);
		moves[3] = new Offsets(1,1);
		moves[4] = new Offsets(1,0);
		moves[5] = new Offsets(1,-1);
		moves[6] = new Offsets(0,-1);
		moves[7] = new Offsets(-1,-1);
		
		for(int i=0; i<14; i++)
			for(int j=0; j<17; j++) {
				if((i==0)||(j==0)||(i==13)||(j==16))	maze[i][j] = 1;
				else {
					maze[i][j] = input[i-1][j-1];
				}
				mark[i][j] = 0;
			}
		System.out.println("Before maze : ");
		PrintMaze(maze);
		System.out.println();
		System.out.println("Before mark : ");
		PrintMaze(mark);
		System.out.println();
		
		items.Path(maze, mark, moves, 12, 15);
		
		System.out.println();
		System.out.println("After maze : ");
		PrintMaze(maze);
		System.out.println();
		System.out.println("After mark : ");
		PrintMaze(mark);
		System.out.println();
	}

}
