package Ex_4_2;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	

	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location +"HANKOOK tire ¼ö¸í: " +(maxRotation-accRotation) +"È¸");
			return true;
		}
		else
			System.out.println("hankook tire ÆãÅ©");
			return false;
	}
	
}
