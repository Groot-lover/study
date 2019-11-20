package eg5th;

public class eg8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new Thread(new SleepThread()).start();
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				Thread.sleep(2000);
			}
			System.out.println("主线程正在输出：" + i);
			Thread.sleep(500);
		}
	}

}
