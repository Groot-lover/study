package eg5th;

public class eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow tW = new TicketWindow();
		new Thread(tW, "窗口1").start();
		new Thread(tW, "窗口2").start();
		new Thread(tW, "窗口3").start();
		new Thread(tW, "窗口4").start();
	}

}
