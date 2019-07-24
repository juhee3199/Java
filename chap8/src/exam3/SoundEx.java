package exam3;

public class SoundEx {
	private static void printSound(Soundable soundable) {		// 2
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {			// 1
		printSound(new Cat());
		printSound(new Dog());
	}
}
