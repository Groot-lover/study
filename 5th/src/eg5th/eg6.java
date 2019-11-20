package eg5th;

public class eg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main是后台线程么？" + Thread.currentThread().isDaemon());
		DamonThread damonThread = new DamonThread();
		Thread thread = new Thread(damonThread, "后线程");
		System.out.println("t是默认后台线程么？" + thread.isDaemon());
		thread.setDaemon(true);
		thread.start();
		for (int i = 0; i < 200; i++) {
			System.out.println(i);
		}
	}

}
