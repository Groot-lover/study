package eg5th;

public class DeadLockThread implements Runnable {
	static Object chopsticks = new Object();
	static Object kinfeAndFork = new Object();
	private boolean flag;

	DeadLockThread(boolean flag) {
		// TODO Auto-generated constructor stub
		this.flag = flag;
	}

	public void run() {
		if (flag) {
			while (true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName() + "---if---chopsticks");
				}
				synchronized (kinfeAndFork) {
					System.out.println(Thread.currentThread().getName() + "---if---knifeAndFork");
				}
			}
		} else {
			while (true) {
				synchronized (kinfeAndFork) {
					System.out.println(Thread.currentThread().getName() + "---if---knifeAndFork");
				}
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName() + "---if---chopsticks");
				}

			}
		}
	}
}
