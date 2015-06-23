package chp06;

class Exercise6_23{
	public static int max(int[] num){
		int max = 0;
		
		if(num==null || num.length==0){
			
			max = -99999;
			
			/* null값인데 return 하지 않으면 NullPointException 오류가 뜸
			 * 1)return max;
			 * 2)return -999999;
			 */
		}
		for(int i=0; i<num.length; i++){
			if(num[i]> max){
				max = num[i];
			}
		}
		return max;
	}
	

	public static void main(String[] args){
		int[] data = {3,2,9,4,7};
	
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
		
		System.out.println("최대값:"+max(null));
	}
}
