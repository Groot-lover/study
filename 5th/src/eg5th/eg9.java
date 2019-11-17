package eg5th;

public class eg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new YieldThread("线程1");
		Thread t2 = new YieldThread("线程2");
		t1.start();
		t2.start();
	}

}
