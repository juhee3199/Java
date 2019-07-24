package Ex_4_2;

public class CarExample {

	public static void main(String[] args) {
		Car car=new Car();					//car객체에서  4개의 타이어가 생성됌.
		
		for(int i=1;i<=5;i++) {
			int problemLocation=car.run();		//run에서 roll을 호출
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 Hankook tire로 교체");
				car.fLTire=new HankookTire("앞왼",15);		//Tire의 자식클래스 객체를 대입. 
				break;										//이후부터 run에서 roll을 호출할 시, HankookTire클래스를 이용.
			case 2:
				System.out.println("앞오  kumho tire로 교체");
				car.fRTire=new HankookTire("앞오",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 Hankook tire로 교체");
				car.bLTire=new HankookTire("뒤왼",14);
				break;
			case 4:
				System.out.println("뒤왼쪽 kumho tire로 교체");
				car.bRTire=new HankookTire("뒤오",17);
				break;
			}
			
			System.out.println("------------");
		}

	}

}
