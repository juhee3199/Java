package Ex_4_2;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	

	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location +"KumhoTire ����: " +(maxRotation-accRotation) +"ȸ");
			return true;
		}
		else
			System.out.println("KumhoTire ��ũ");
			return false;
	}
}
