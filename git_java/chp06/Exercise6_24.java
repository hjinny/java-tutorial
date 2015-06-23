package chp06;

class Exercise6_24
{
	static int abs(int value){
		return Math.abs(value);
		//return value >= 0 ? value : -value;
	}
		

	public static void main(String[] args) 
	{
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));	//5의 절대값:5
		
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));	//-10의 절대값:10

	}
}
