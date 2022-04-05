package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		//Map : (key, value)의 쌍으로 저장
		//(key, value) : enty, entry는 순서가 없음
		//key는 중복 안됨
		
		Map<String, String> map = new HashMap<>();
		
		//put : entry 추가
		map.put("bts","boy group");
		map.put("aespa", "girl group");
		map.put("tesla","car");
		map.put("tesla","elon musk");
		
		
		// size : entry 수
		int size = map.size();
		System.out.println(size);
		
		// get : key를 사용해서 value 얻음
		String var1 = map.get("bts");
		String var2 = map.get("aespa");
		String var3 = map.get("tesla");
		String var4 = map.get("bitcoin");
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		// keySet : key를 Set 타입으로 리턴
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		// 전체탐색1 : keySet, get
		Set<String> keyset = map.keySet();
		
		for(String key : keyset) {
			String value = map.get(key);
			
			System.out.println(key + ":" + value);
		}
		
		// 전체탐색2 : entrySet
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		// remove : key로 entry 삭제
		map.remove("tesla");
		System.out.println(map.size());
		System.out.println(map);
		
		// containsKey : key가 있는 지 확인
		System.out.println(map.containsKey("aespa"));
		System.out.println(map.containsKey("tesla"));
		
		
	}
}
