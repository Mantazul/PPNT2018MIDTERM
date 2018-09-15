package datastructure;

import com.mongodb.*;
import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args)throws Exception {
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

//		ConnectToSqlDB conn = new ConnectToSqlDB();
//		conn.insertStringDataFromArrayListToSqlTable(wishList,"WishList","wishes");
//		List<String> DBData = new ArrayList<String>();
//		try {
//			DBData = conn.readDataBase("WishList","wishes");
//			for (String str: DBData) {
//				System.out.println(str);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB database = mongoClient.getDB("listDB");
		database.createCollection("lists",null);
		DBCollection collection = database.getCollection("lists");

//		//Do this Step only once to avoid multiple insertions
//		BasicDBObject document1 = new BasicDBObject();
//		document1.put("HP",HP);
//		collection.insert(document1);
//
//		//Do this Step only once to avoid multiple insertions
//		BasicDBObject document2 = new BasicDBObject();
//		document2.put("vacation",faveSpots);
//		collection.insert(document2);

		// retrieve the lists from Database
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("HP", HP);
		DBCursor cursor = collection.find(searchQuery);
		System.out.print("\nretrieved from DB");
		while (cursor.hasNext()) {
			System.out.println("\n"+cursor.next());
		}

		// retrieve the lists from Database
		BasicDBObject searchQuery2 = new BasicDBObject();
		searchQuery2.put("vacation",faveSpots);
		DBCursor cursor2 = collection.find(searchQuery2);
		System.out.print("\nretrieved from DB");
		while (cursor2.hasNext()) {
			System.out.println("\n"+cursor2.next());
		}
	}

}
