package chp06;

class Exercise6_2 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());	//3
		System.out.println(card2.info());	//1K
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num, boolean kwang){
		this.num = num;
		this.isKwang = kwang;
	}
	
	public String info(){
		return this.num + (this.isKwang ? "K" : "") ;
	}
	
}
