import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapEx {

	public static void main(String[] args) {

		String[][] data = { { "a", "b" }, { "c", "d" }, { "e", "f" } };
		Stream<String[]> dataStream = Arrays.stream(data);
		Stream<String> dataflatmap = dataStream.flatMap(x -> Arrays.stream(x));
		Stream<String> datafilter = dataflatmap.filter(x -> "a".equals(x.toString()));
		datafilter.forEach(System.out::println);

		Stream<String> dataf = Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x -> "c".equals(x.toString()));

		dataf.forEach(x -> System.out.println(x));

		Employee emp = new Employee();
		emp.setName("Vishal");
		emp.addevice("iphone");
		emp.addevice("samsung");
		emp.addevice("mi");
		emp.addevice("lenovo");
		Employee emp1 = new Employee();
		emp1.setName("Naveen");
		emp1.addevice("iphone");
		emp1.addevice("moto");
		emp1.addevice("mi");
		emp1.addevice("realmi");

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);

		List<String> devicelist = list.stream().map(x -> x.getdevice()).flatMap(x -> x.stream()).distinct()
				.collect(Collectors.toList());
		devicelist.forEach(System.out::println);

		int data2[]= {1,2,3,4,5};
				IntStream dt=Stream.of(data2).flatMapToInt(x->Arrays.stream(x));
				
					dt.forEach(System.out::println);
		}

}
