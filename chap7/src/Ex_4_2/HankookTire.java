package Ex_4_2;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	

	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location +"HANKOOK tire ����: " +(maxRotation-accRotation) +"ȸ");
			return true;
		}
		else
			System.out.println("hankook tire ��ũ");
			return false;
	}
	
}
