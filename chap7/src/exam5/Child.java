package exam5;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo=studentNo;
		
		System.out.println(name +"  " +studentNo);
	}
}
