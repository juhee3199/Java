package Ex_8_4;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc=null;
		
		rc=new TV();
		rc.turnOn();
		rc.setMute(true);
		
		rc=new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
