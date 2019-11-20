package eg5th;

public class eg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleThread saleThread = new SaleThread();
		new Thread(saleThread, "线程一").start();
		new Thread(saleThread, "线程二").start();
		new Thread(saleThread, "线程三").start();
		new Thread(saleThread, "线程四").start();
	}

}
