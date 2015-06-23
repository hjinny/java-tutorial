package chp06;

class Exercise6_6 {
        // 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		double diff_x = 0;
		double diff_y = 0;
		double result = 0;
		
		diff_x = x1 - x;
		diff_y = y1 - y;
		
		diff_x *= diff_x;
		diff_y *= diff_y;
		
		result = Math.sqrt(diff_x + diff_y);
		
		
		return result;
		//return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 지역변수
	}

	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2)); //1.4142135623730951
	}
}
