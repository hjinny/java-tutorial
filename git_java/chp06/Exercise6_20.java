package chp06;

class Exercise6_20
{
	public static  int[] shuffle(int[] arr){
		
		final int LENGTH = arr.length;
		int random = 0;
		int tmp[] = new int[LENGTH];
		
		for(int i=0; i<arr.length; i++){
			random = (int)(Math.random() * 9);
			tmp[i] = arr[random];
		}

		return tmp;
		
	}
		

	public static void main(String[] args) 
	{
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
	}
}

