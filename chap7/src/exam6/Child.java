package exam6;

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("주희");
		System.out.println("child() call");
	}
	
	public Child(String name) {
	//	super();					//자동 호출됌. 부모클래스가 먼저 호출되므로.
		this.name=name;
		System.out.println("child(String name) call");
	}
}
