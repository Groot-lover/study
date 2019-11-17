package eg5th;

public class eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread mythread = new Mythread();
		Thread thread = new Thread(mythread);
		thread.start();
		while (true) {
			System.out.println("main");
		}
	}

}
