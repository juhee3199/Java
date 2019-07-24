package exam20;

import java.util.Scanner;

public class BankApp {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run=true;
		
		while(run) {
			System.out.println("----------------");
			System.out.println("1.���»���  2.���  3.����  4.���  5.����");
			System.out.println("----------------");
			System.out.println("����>  ");
			
			int selectNo=scanner.nextInt();
			
			if(selectNo==1) 
				createAccount();
			else if(selectNo==2)
				 accountList();
			else if(selectNo==3)
				desposit();
			else if(selectNo==4)
				withdraw();
			else if(selectNo==5)
				run=false;
		}
		
		System.out.println("���α׷� ����");
	}
		
	
	// selectNo==1
	private static void createAccount() {
		System.out.println("----------------");
		System.out.println("���»���");
		System.out.println("----------------");
		
		System.out.print("���¹�ȣ: ");
		String ano=scanner.next();
		System.out.print("������: ");
		String owner=scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance=scanner.nextInt();
		
		Account newAccount = new Account(ano,owner,balance);	// ���ο� ���¸� ����� ���� ��ü ����
		
		for(int i=0;i<accountArray.length;i++) {		// ���� ����� ���� �����¸� �迭�� ����.
			if(accountArray[i]==null) {
				accountArray[i]=newAccount;
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}

		
	}
	
	//selectNo==2
	private static void accountList() {
		System.out.println("----------------");
		System.out.println("���¸�� ");
		System.out.println("----------------");
		
		for(int i=0;i<accountArray.length;i++) {
			Account account = accountArray[i];
			if(account!=null) {								//
				System.out.print(account.getAno());
				System.out.print("   ");
				System.out.print(account.getOwner());
				System.out.print("   ");
				System.out.println(account.getBalance());
			}
		}
	}
	
	//selectNo==3
	private static void desposit() {
		System.out.println("----------------");
		System.out.println("����");
		System.out.println("----------------");
		
		System.out.print("���¹�ȣ: ");
		String ano=scanner.next();
		System.out.print("���ݾ�: ");
		int money=scanner.nextInt();				//���ݾ�
		
		Account account = findAccount(ano);		//findAccount �޼ҵ带 �̿��ؼ� ���� ����.
		
		if(account==null) {						//�ش� ���°� ���� ���.
			System.out.println("���°� �����ϴ�.");
		}
		else {
			account.setBalance(account.getBalance() + money);	//���ݾ��� �ش� ������ ���±ݾ׿� �߰�.
			System.out.println("���: ���� ����");
		}
		
	}
	
	//account�� ã�� ���� �޼ҵ�
	private static Account findAccount(String ano) {	
		Account account=null;
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {			//�Էµ� ���¹�ȣ�� ���� ���¹�ȣ�� �ִٸ�,
					account=accountArray[i];				
					break;
				}
			}
		}
		return account;			//���°� return. ���¸� ã�� ���ߴٸ� null�� return 
	}
	
	
	//selectNo==4
	private static void withdraw() {
		System.out.println("----------------");
		System.out.println("���");
		System.out.println("----------------");
		
		System.out.print("���¹�ȣ: ");
		String ano=scanner.next();
		System.out.print("��ݾ� ");
		int money=scanner.nextInt();
		
		Account account = findAccount(ano);	
		
		if(account==null) {						//�ش� ���°� ���� ���.
			System.out.println("���°� �����ϴ�.");
		}
		else {
			account.setBalance(account.getBalance()-money);
			System.out.println("��� ����");
		}	
	}

}
