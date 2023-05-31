package j0530_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class C0530_08 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.get(0);
		System.out.println("list : "+list.get(0));
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.hasNext());
		}
		
		
		
		HashMap map = new HashMap<>();
		map.put("id", "aaa");
		map.put("list", "data");
		map.put("no", "1");
		map.put("lastNo", "100");
		map.put("id", "bbb");
		System.out.println("map : "+map.get("id")); //한개 출력
		
		//전체 출력
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());		
		}
	}

}
