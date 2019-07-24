package exam15;

public class MemberSer {
//	String id;
	//String password;
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345"))  //id=="hong" (X)
			return true;
		else 
			return false;
	}
	void logout(String id) {
		System.out.println("·Î±×¾Æ¿ô");
	}
}
