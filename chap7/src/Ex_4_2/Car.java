package Ex_4_2;

public class Car {
	Tire fLTire= new Tire("�տ���",6);
	Tire fRTire= new Tire("�տ�", 2);
	Tire bLTire= new Tire("�ڿ�", 3);
	Tire bRTire= new Tire("�ڿ�", 4);
	
	int run() {
		System.out.println("�ڵ����� �޸�.");
		
		if(fLTire.roll()==false) {		//Ÿ�̾��� ������ ���ϸ�, ���� ���߰� main���� Ÿ�̾ ��ü.
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
		return 0;					//��� Ÿ�̾ ������ ���.
	}
	
	void stop() {
		System.out.println("�ڵ��� ����");
	}
}
