
public class normalcall {

	public static void main(String[] args) {

/*		//Creating separate class to call interface
		//by using anonymous class to call interface
		//By Using lambda expressions
		MyInter my=new myintercall();
		my.sayHello();
		MyInter my2=new MyInter() {

			@Override
			public void sayHello() {
				System.out.println("calling interface from anonymous class");				
			}
			
		};
		my2.sayHello();
		MyInter my3=()->{
			System.out.println("Using Lambda Expression");
		};
		my3.sayHello();
		MyInter my4=()->System.out.println("Using Lambda Expression second time");
		my4.sayHello();
		
		sumInter su=(int a,int b)->{
			return a+b;
		};
		
		System.out.println("Sum of two number "+su.sum(4, 12));
		
		//another way of writing 
		sumInter su2=(a, b)-> a+b;
		System.out.println("Another way sum "+su2.sum(10, 20));
		
		StriInter str1=(s)-> s.length();
		System.out.println("Length of String "+str1.Length("Vishal Lokhande"));*/
//	dotask tas=()->{
//		System.out.println("I am getting called from dotask");
//	};
//	tas.dotas();
		//Method referencing classname::methodname
		dotask tas=Methodref::dostuff;
		tas.dotas();
		Runnable tas1=Methodref::threadtask;
		Thread t=new Thread(tas1);
		t.start();
		//Method referencing Object::methodname
		Methodref m=new Methodref();
		Runnable tas2=m::threadsafe;
		Thread t2=new Thread(tas1);
		t2.start();
		
	}
	
	
}
