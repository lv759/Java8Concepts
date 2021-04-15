import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryEx {

	public static void main(String[] args) {

		UnaryOperator<Integer> un= x -> x*2;
		int val=un.apply(10);
		System.out.println(val);
		
		Function<Integer,Integer> func=x->x*10;
		System.out.println(func.apply(20));
		
		List<String> list=new ArrayList<String>();
		list.add("Vishu");
		list.add("Tom");
		list.add("Tim");
		System.out.println(list);
		list.replaceAll(x-> x+" Tester");
		System.out.println(list);
		
		
	}

}
