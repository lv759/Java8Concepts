import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountWord {

	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		String[] it=str.split(" ");
		Map<String,Integer> map=new HashMap<String,Integer>();

		for(String word : it) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
				System.out.println(map.get(word));
			}else {
				map.put(word, 1);
				System.out.println(map.get(word));
			}
		}
		Set<String> set=map.keySet();
		for(String word:set) {
			if(map.get(word)>1) {
				System.out.println(map.get(word));
			}
		}
	}
}
	


