package Mypack;

public class WeightCount {
	private int num;
	
	public WeightCount() {
	}
	
	public WeightCount(int num) {
		this.num = num;
	}
	
	public String result() {
		return result(num);
	}

	public String result(int num) {
		int cnt = 0;
		String str = "";
		for(int i=1; i<=10; i++){
			for(int j=1; j<=10; j++){
				for(int k=1; k<=10; k++) {
					int sum = i*2 + j*3 + k*5;
					
					if (sum == num) {
						cnt++;
						str += String.format("(%d,%d,%d)", i, j, k);
					}
				}
			}
		}
		return str + String.format(":%d", cnt);
	}

}
