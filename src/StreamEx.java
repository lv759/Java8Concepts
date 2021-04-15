import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Vishal","Pawan","Naveen","Ragav");
		//list.forEach(x->System.out.println(x));
		//list.forEach(System.out::println);
		
		List<String> result=list.stream().filter(x->!x.equals("Ragav"))
				.collect(Collectors.toList());
		List<String> result2=list.stream().filter(x->x.equals("Ragav"))
				.collect(Collectors.toList());
		//result.forEach(System.out::println);
		//result2.forEach(a->System.out.println(a));
		
		List<Customer> cus=Arrays.asList(
				new Customer("Vishal",23),
				new Customer("Pawan",25),
				new Customer("Naveen",28),
				new Customer("Ragav",26)
				);
		Customer ct=cus.stream().filter(x->"Pawan".equals(x.getName())).findAny().orElse(null);
	System.out.println(ct.getName()+" "+ct.getAge());
	
	Customer ct2=cus.stream().filter(x->"Fundoo".equals(x.getName())).findAny().orElse(null);
	System.out.println(ct2);
	
	//multiple Conditions

	Customer ct3=cus.stream().filter(x->"Vishal".equals(x.getName()) && 23==x.getAge()).findAny().orElse(null);
	System.out.println(ct3.getName()+" "+ct3.getAge());
	
	String str=cus.stream().filter(x->"Naveen".equals(x.getName()))
	.map(Customer::getName).findAny().orElse(null);
	
	System.out.println(str);
	List<String> lts=cus.stream().map(Customer::getName).collect(Collectors.toList());
	lts.forEach(System.out::println);
	}

}
