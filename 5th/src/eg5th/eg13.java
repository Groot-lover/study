package eg5th;

public class eg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticletl ticket = new Ticletl();
		new Thread(ticket, "线程1").start();
		new Thread(ticket, "线程2").start();
		new Thread(ticket, "线程3").start();
		new Thread(ticket, "线程4").start();
	}

}
