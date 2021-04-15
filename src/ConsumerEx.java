import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> con = x -> System.out.println(x);
		con.accept("Vishal is good automation Tester");

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<String> list2 = Arrays.asList("Vishal", "tom", "Naveen", "Ragav", "Pawan");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("***********");
		for (String l : list2) {
			System.out.println(l);
		}
		System.out.println("***********");

		list.forEach(x -> System.out.println(x));// Lambda Expressions

		System.out.println("***********");
		list.forEach(new Consumer<Integer>() {// Anonymous Class

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}

		});
		System.out.println("***********");

		list2.forEach(new Consumer<String>() {// Anonymous Class

			@Override
			public void accept(String t) {
				System.out.println(t);
			}

		});
		System.out.println("***********");
		list2.forEach(System.out::println);// Method Referencing

		getText(() -> "Java");
		getText(() -> "Selenium");
		getText(() -> "SQL");
	}

	public static void getText(Supplier<String> test) {
		System.out.println(test.get());
	}
}
