package Ex_4_2;

public class Tire {
	public int maxRotation;
	public int accRotation;
	public String location;
	
	public Tire(String location, int maxRotation){
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	//Ÿ�̾��� ���� ����
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location +"Tire ����: " +(maxRotation-accRotation) +"ȸ");
			return true;
		}

		else {
			System.out.println(location +"Tire ��ũ");
			return false;
		}
			
	}
}
