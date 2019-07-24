package Ex_4_2;

public class Car {
	Tire fLTire= new Tire("앞왼쪽",6);
	Tire fRTire= new Tire("앞오", 2);
	Tire bLTire= new Tire("뒤왼", 3);
	Tire bRTire= new Tire("뒤오", 4);
	
	int run() {
		System.out.println("자동차가 달림.");
		
		if(fLTire.roll()==false) {		//타이어의 수명이 다하면, 차를 멈추고 main에서 타이어를 교체.
			stop();
			return 1;
		}
		if(fRTire.roll()==false) {
			stop();
			return 2;
		}
		if(bLTire.roll()==false) {
			stop();
			return 3;
		}
		if(bRTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;					//모든 타이어가 정상일 경우.
	}
	
	void stop() {
		System.out.println("자동차 멈춤");
	}
}
