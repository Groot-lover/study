package eg5th;

public class Mythread extends Thread {
	public void run() {
		while (true) {
			System.out.println("Mythread");
		}
	}
}
