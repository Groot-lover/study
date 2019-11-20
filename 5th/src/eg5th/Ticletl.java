package eg5th;

public class Ticletl implements Runnable {
	private int tickets = 10;
	Object lock = new Object();

	public void run() {
		while (true) {
			synchronized (lock) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "----卖出的票" + tickets--);
				} else {
					break;
				}
			}
		}
	}
}
