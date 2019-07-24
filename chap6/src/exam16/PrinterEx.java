package exam16;

public class PrinterEx {
	public static void main(String[] args) {
		
		// 2. println메소드 이용하기
		Printer printer = new Printer();

		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
	
	// 1. 필드, 생성자만든 후, main에서 print하기
	/*
	public static void main(String[] args) {
		Printer printer = new Printer(10);
		System.out.println(printer.value);
	}
	*/
}
