package eg5th;

public class Ticketl implements Runnable {
	private int tickles = 10;

	public void run() {
		while (true) {
			saleTicket();
			if (tickles <= 0) {
				break;
			}
		}
	}

	private synchronized void saleTicket() {
		if (tickles > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "----卖出的票" + tickles--);
		}
	}
}
