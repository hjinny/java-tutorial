package chp06;

class Exercise6_4 {
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban  = 1;
		s.no   = 1;
		s.kor  = 100;
		s.eng  = 60;
		s.math = 76;

		System.out.println("이름 : "+s.name);
		System.out.println("총점 : "+s.getTotal());
		System.out.println("평균 : "+s.getAverage());	// 78.7
	}
}

class Student {
	String name;
	int    ban;
	int    no;
	int    kor;
	int    eng;
	int    math;
	
	Student(){
		this("아무개",1,0,0,0,0);
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
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
		//sum = kor + eng + math;
		
		return sum; 
	}
	
	public float getAverage(){
		float avg = 0;
		
		avg = (float)(getTotal() / 3.0);
		avg = Math.round(avg * 10) / 10f;
		//avg = (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		return avg;
	}
	
}

