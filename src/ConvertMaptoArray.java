import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConvertMaptoArray {
public static void main(String[] args) {
	Map<String,Integer> map=new HashMap<String,Integer>();
	map.put("Mohan", 20000);
	map.put("Sohan", 30000);
	map.put("Rohan", 40000);
	map.put("Cohan", 50000);
	
	Iterator it=map.entrySet().iterator();
	while(it.hasNext()) {
		Map.Entry pair=(Map.Entry) it.next();
		System.out.println(pair.getKey()+"="+pair.getValue());
	}
	System.out.println("**********************");
	List<String> list=new ArrayList<String>(map.keySet());
	System.out.println("total no of values"+list.size());
	System.out.println(list);
	for(String s:list) {
		System.out.println(s);
	}
	System.out.println("**********************");
	List<Integer> list2=new ArrayList<Integer>(map.values());
	System.out.println("total no of values"+list2.size());
	System.out.println(list2);
	for(Integer st:list2) {
		System.out.println(st);
	}
}
	
}
