package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> HP = new ArrayList<String>();
		HP.add("Sorcerers Stone");
		HP.add("Chamber of Secrets");
		HP.add("Prisoner of Azkaben");
		HP.add("goblet of fire");
		HP.add("halfblood prince");
		HP.add("Order of the Phoenix");
		HP.add("Deathly Hallows P1");
		HP.add(7,"Deathly Hallows P2");

		List<String> faveSpots = new ArrayList<String>();
		faveSpots.add("toronto");
		faveSpots.add("bangladesh");
		faveSpots.add("london");
		faveSpots.add("michigan");

		List<String> wishList = new ArrayList<String>();
		wishList.add("get 100k job");
		wishList.add("Buy house");
		wishList.add("Buy Mercedes");
		wishList.add("visit NewZealand");
		wishList.add("buy Massage Chair");
		wishList.add("retire");

		Map<String,List<String>> demo = new HashMap<>();
		demo.put("allHPmovies",HP);
		demo.put("vacatinSpots", faveSpots);
		demo.put("goals",wishList);

		System.out.println("\n foreach traversal \n");
		for (Map.Entry en: demo.entrySet()) {
			System.out.println(en.getKey());
			System.out.println(en.getValue()+"\n");

		}

		System.out.println("\n iterator traversal \n");
		Iterator<Map.Entry<String, List<String>>> itr = demo.entrySet().iterator();

		while(itr.hasNext())
		{
			Map.Entry entry = itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue()+ "\n");
		}

	}

}
