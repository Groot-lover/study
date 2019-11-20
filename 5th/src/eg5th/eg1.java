package eg5th;

public class eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread mythread = new Mythread();
		mythread.start();
		while (true) {
			System.out.println("main");
		}
	}

}
