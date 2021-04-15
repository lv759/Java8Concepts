import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FunctionalEx {
	public static void main(String[] args) {

		Function<String, Integer> func = x -> x.length();
		System.out.println(func.apply("Vishal"));
		
		// chaining of Functional interface
		
		Function<Integer, Integer> func2 = x -> x * 2;
		int tr = func.andThen(func2).apply("Hello");
		System.out.println(tr);

		
		BinaryOperator<Integer> bin=(x1,x2)->(x1+x2);
		System.out.println(bin.apply(20, 30));
		
		BiFunction<Integer,Integer,Integer> bin2=(x1,x2)->(x1*x2);
		int gt=bin2.apply(10, 2);
		System.out.println(gt);
	}
}
