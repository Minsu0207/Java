package doit;

public class EightQueens {
	static int num = 0;
	static int[] qcol = new int[8];
	static boolean[] rck = new boolean[8];
	static boolean[] rdia = new boolean[15];//i+j
	static boolean[] ldia = new boolean[15];//i-j+7
	
	public static void qprint() {
		System.out.printf("%d : [ ",++num);
		for(int i=0; i<8; i++)
			System.out.printf("%d ",qcol[i]);
		System.out.print(" ]");
		System.out.println();
	}
	
	public static void set(int i) {
		for(int j=0; j<8; j++) {
			if(!rck[j] && !rdia[i+j] && ! ldia[i-j+7]) {
				qcol[i] = j;
				if(i==7){
					qprint();
				}
				else {
					rck[j] = rdia[i+j] = ldia[i-j+7] = true;
					set(i+1);
					rck[j] = rdia[i+j] = ldia[i-j+7] = false;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set(0);
	}

}
