package exam16;

public class PrinterEx {
	public static void main(String[] args) {
		
		// 2. println�޼ҵ� �̿��ϱ�
		Printer printer = new Printer();

		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");
	}
	
	// 1. �ʵ�, �����ڸ��� ��, main���� print�ϱ�
	/*
	public static void main(String[] args) {
		Printer printer = new Printer(10);
		System.out.println(printer.value);
	}
	*/
}
