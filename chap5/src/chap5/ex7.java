package chap5;

public class ex7 {
	public static void main(String[] args) {
		int max=0;
		int[] array= {1,5,3,8,2};
		
		for(int i=0;i<5;i++) {
			if(array[i]>max) {
				
				max=array[i];
			}
		}
		
		System.out.println("max:" +max);
	}
}
