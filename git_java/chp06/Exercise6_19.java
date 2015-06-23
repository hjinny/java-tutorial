package chp06;

class Exercise6_19
{
	public static void change(String str) {
		str += "456";
	}

	public static void main(String[] args) 
	{
		String str = "ABC123";
		System.out.println(str);		
		change(str);
		System.out.println("After change:"+str);		
	}
}


/*
 * 6-8
 * class 	value 	: width, height
 * instance value 	: kind, num
 * local	vale	: card 
 * 
 * 6-9	: x, y (반드시 있어야 하는 공유 변수라서)
 * 6-10 : b(for 초기화), e(오버로딩 가능)
 * 6-11 : b
 * 6-12 : c,d
 * 6-13 : b, c, d
 * 6-16 : a, e(호출스택)
 * 6-17 : b 
 * 
 * 6-18 : 라인 A,B,D (static 변수와 메서드는 인스턴스 변수를 사용할 수 없다. static 변수는 클래스가 로딩될때 로드되기 때문에 그 전에 인스턴스 변수가 생성되지 않았기 때문)
 * 
 */
