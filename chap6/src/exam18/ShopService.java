package exam18;

public class ShopService {
	//���� �ʵ�
	private static ShopService singleton = new ShopService();
	
	//������
	private ShopService() {
	}
	
	//�޼ҵ�
	static ShopService getInstance() {
		return singleton;
	}
}
