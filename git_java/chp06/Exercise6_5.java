package chp06;

class Exercise6_5 {
	public static void main(String args[]) {
		Student2 s = new Student2("홍길동",1,1,100,60,76);

		System.out.println(s.info());	//홍길동,1,1,100,60,76,236,78.7
	}
}

class Student2 {
	String name;
	int    ban;
	int    no;
	int    kor;
	int    eng;
	int    math;
	
	
	Student2(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban  = ban;
		this.no	  = no;
		this.kor  = kor;
		this.eng  = eng;
		this.math = math;
	}
	
	public int getTotal(){
		int sum = 0;
		sum = this.kor + this.eng + this.math;
		
		return sum; 
	}
	
	public float getAverage(){
		float avg = 0;
		
		avg = (float)(getTotal() / 3.0);
		avg = Math.round(avg * 10) / 10f;
		return avg;
	}
	
	public String info(){
		String rtnMsg = "";
		
		rtnMsg = this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + "," + getTotal() + "," + getAverage(); 
		return rtnMsg;
	}
	
}
