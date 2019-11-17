package eg5th;

public class eg10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new EmergencyThread(), "线程1");
		thread.start();
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName() + "输出：" + i);
			if (i == 2) {
				thread.join();
			}
			Thread.sleep(500);
		}
	}

}
