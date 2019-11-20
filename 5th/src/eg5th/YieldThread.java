package eg5th;

public class YieldThread extends Thread {
	public YieldThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "---" + i);
			if (i == 3) {
				System.out.println("线程让步：");
				Thread.yield();
			}
		}
	}

	void publli() {
		// TODO Auto-generated method stub

	}
}
