package Ex_4_2;

public class CarExample {

	public static void main(String[] args) {
		Car car=new Car();					//car��ü����  4���� Ÿ�̾ ������.
		
		for(int i=1;i<=5;i++) {
			int problemLocation=car.run();		//run���� roll�� ȣ��
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� Hankook tire�� ��ü");
				car.fLTire=new HankookTire("�տ�",15);		//Tire�� �ڽ�Ŭ���� ��ü�� ����. 
				break;										//���ĺ��� run���� roll�� ȣ���� ��, HankookTireŬ������ �̿�.
			case 2:
				System.out.println("�տ�  kumho tire�� ��ü");
				car.fRTire=new HankookTire("�տ�",13);
				break;
			case 3:
				System.out.println("�ڿ��� Hankook tire�� ��ü");
				car.bLTire=new HankookTire("�ڿ�",14);
				break;
			case 4:
				System.out.println("�ڿ��� kumho tire�� ��ü");
				car.bRTire=new HankookTire("�ڿ�",17);
				break;
			}
			
			System.out.println("------------");
		}

	}

}
