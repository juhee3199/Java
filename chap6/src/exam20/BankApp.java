package exam20;

import java.util.Scanner;

public class BankApp {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run=true;
		
		while(run) {
			System.out.println("----------------");
			System.out.println("1.계좌생성  2.목록  3.예금  4.출금  5.종료");
			System.out.println("----------------");
			System.out.println("선택>  ");
			
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
		
		System.out.println("프로그램 종료");
	}
		
	
	// selectNo==1
	private static void createAccount() {
		System.out.println("----------------");
		System.out.println("계좌생성");
		System.out.println("----------------");
		
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		System.out.print("계좌주: ");
		String owner=scanner.next();
		System.out.print("초기입금액: ");
		int balance=scanner.nextInt();
		
		Account newAccount = new Account(ano,owner,balance);	// 새로운 계좌를 만들기 위한 객체 생성
		
		for(int i=0;i<accountArray.length;i++) {		// 계좌 목록을 위해 각계좌를 배열에 저장.
			if(accountArray[i]==null) {
				accountArray[i]=newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}

		
	}
	
	//selectNo==2
	private static void accountList() {
		System.out.println("----------------");
		System.out.println("계좌목록 ");
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
		System.out.println("예금");
		System.out.println("----------------");
		
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		System.out.print("예금액: ");
		int money=scanner.nextInt();				//예금액
		
		Account account = findAccount(ano);		//findAccount 메소드를 이용해서 값을 구함.
		
		if(account==null) {						//해당 계좌가 없을 경우.
			System.out.println("계좌가 없습니다.");
		}
		else {
			account.setBalance(account.getBalance() + money);	//예금액을 해당 계좌의 계좌금액에 추가.
			System.out.println("결과: 예금 성공");
		}
		
	}
	
	//account를 찾기 위한 메소드
	private static Account findAccount(String ano) {	
		Account account=null;
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {			//입력된 계좌번호와 같은 계좌번호가 있다면,
					account=accountArray[i];				
					break;
				}
			}
		}
		return account;			//계좌가 return. 계좌를 찾지 못했다면 null이 return 
	}
	
	
	//selectNo==4
	private static void withdraw() {
		System.out.println("----------------");
		System.out.println("출금");
		System.out.println("----------------");
		
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		System.out.print("출금액 ");
		int money=scanner.nextInt();
		
		Account account = findAccount(ano);	
		
		if(account==null) {						//해당 계좌가 없을 경우.
			System.out.println("계좌가 없습니다.");
		}
		else {
			account.setBalance(account.getBalance()-money);
			System.out.println("출금 성공");
		}	
	}

}
