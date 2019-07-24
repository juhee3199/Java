package Ex_4_2;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	

	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location +"KumhoTire ¼ö¸í: " +(maxRotation-accRotation) +"È¸");
			return true;
		}
		else
			System.out.println("KumhoTire ÆãÅ©");
			return false;
	}
}
