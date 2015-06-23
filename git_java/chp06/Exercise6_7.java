package chp06;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int x1, int y1) {
		double diff_x = 0;
		double diff_y = 0;
		double result = 0;
		
		diff_x = x1 - this.x;
		diff_y = y1 - this.y;
		
		diff_x *= diff_x;
		diff_y *= diff_y;
		
		result = Math.sqrt(diff_x + diff_y);
		
		return result;
	}
}

class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);

        // MyPoint와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2)); //1.4142135623730951
	}
}
