package exam15;

public class MemberSerEx {
	public static void main(String[] args) {
		MemberSer member = new MemberSer();
		boolean result = member.login("hong","12345");
		
		if(result) {
			System.out.println("�α���");
			member.logout("hong");
		}
		else {
			System.out.println("id, password �ùٸ��� ����.");
		}
	}

}
