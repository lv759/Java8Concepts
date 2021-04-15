import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {
public static void main(String[] args) {
	
	Predicate<Integer> pre=x-> x > 5;
	List<Integer> list=Arrays.asList(2,4,3,5,6,7,8,9,10);
	List<Integer> st=list.stream().filter(pre).collect(Collectors.toList());
	System.out.println(st);
	
	// use of &&
	List<Integer> list2=Arrays.asList(2,4,3,5,6,7,8,9,10);
	List<Integer> st2=list2.stream().filter(ele->ele>5 && ele<9).collect(Collectors.toList());
	System.out.println(st2);
	
	//Use of negate() Function
	List<String> lt=Arrays.asList("Vis","Vishal","Java","Jav","Vikas","Jev");
	Predicate<String> prd=x-> x.startsWith("Vishal");
	List<String> trim=lt.stream().filter(prd.negate()).collect(Collectors.toList());
	System.out.println(trim);
}
}
