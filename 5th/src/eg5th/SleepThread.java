package eg5th;

public class SleepThread implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			System.out.println("线程一正在输出：" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
