
public class Lambdathread {
public static void main(String[] args) {
	Runnable run=()->{
		for(int i=1;i<=5;i++) {
			System.out.println("Value of i is "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread t1=new Thread(run);
	t1.setName("John");
	t1.start();
	Runnable run2=()->{
		for(int i=1;i<=10;i++) {
			System.out.println("Mulitplication of no is "+i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	Thread t2=new Thread(run2);
	t2.start();
	
}

}
