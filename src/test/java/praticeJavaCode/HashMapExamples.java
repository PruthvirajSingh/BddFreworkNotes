package praticeJavaCode;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("f value", 1);
		hashMap.put("s  value", 2);
		hashMap.put("t value", 3);
		
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}
}

