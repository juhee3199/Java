package exam6;

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("����");
		System.out.println("child() call");
	}
	
	public Child(String name) {
	//	super();					//�ڵ� ȣ���. �θ�Ŭ������ ���� ȣ��ǹǷ�.
		this.name=name;
		System.out.println("child(String name) call");
	}
}
