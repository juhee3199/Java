package exam18;

public class ShopService {
	//정적 필드
	private static ShopService singleton = new ShopService();
	
	//생성자
	private ShopService() {
	}
	
	//메소드
	static ShopService getInstance() {
		return singleton;
	}
}
