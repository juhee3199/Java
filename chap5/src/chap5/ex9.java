package chap5;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		boolean run=true;
		int studentNum=0;
		int[] scores=null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------");
			System.out.println("1.�л���  2.�����Է�  3.��������Ʈ  4.�м�  5.����");
			System.out.println("-----------------");
			System.out.println("����> ");
		
		
			int selectNo = scanner.nextInt();
		
			switch(selectNo) {
				case 1:
					studentNum=scanner.nextInt();
					scores=new int[studentNum];			//
					break;
			
				case 2:
					for(int i=0;i<studentNum;i++) {
						System.out.print("scores[" +i +"]: ");
						scores[i]=scanner.nextInt();
					}
					break;
				case 3:
					for(int i=0;i<studentNum;i++) {
						System.out.println("scores[" +i +"]: " +scores[i]);
					}
					break;
				case 4:
					int max=0;
					int sum=0;
					double avg;
					
					for(int i=0;i<studentNum;i++) {
						sum+=scores[i];
						if(scores[i]>max)
							max=scores[i];
					}
					avg=(double)sum/studentNum;
					System.out.println("�ְ�����: " +max);
					System.out.println("�������: " +avg);
					break;
				case 5:
					run=false;
					break;
			}
		}	
		System.out.println("���α׷� ����");
		
	}
}
