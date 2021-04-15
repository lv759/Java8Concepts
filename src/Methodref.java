import java.time.LocalDate;

public class Methodref {
public static int dostuff() {
	System.out.println("I am doing stuff from methodref");
	LocalDate l=LocalDate.now();
	System.out.println("Date :"+l);
	return 5;
}
public static void threadtask()  {
	for(int i=1;i<=10;i++) {
		System.out.println("Mulptiplication "+i*2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	public  void threadsafe()  {
		for(int i=1;i<=5;i++) {
			System.out.println("value is "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
