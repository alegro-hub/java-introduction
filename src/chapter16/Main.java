package chapter16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String args[]) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");

		List<String> list = new ArrayList<String>();

		list.add(h1.getName());
		list.add(h2.getName());

		for(String name:list) {
			System.out.println(name);
		}

		Map<Hero,Integer> map = new HashMap<>();

		map.put(h1, 3);
		map.put(h2, 7);

		for(Hero h:map.keySet()) {
			System.out.println(h.getName()+"が倒した敵＝"+map.get(h));
		}

	}

}
