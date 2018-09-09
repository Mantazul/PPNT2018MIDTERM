package math.problems;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static boolean isPrime(int n){
		if(n%2 == 0){
			return false;
		}
		for (int i = 3; i<n;i++){
			if (n%i == 0){
				return false;
			}
		} return true;
	}

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int count;
		count=0;
		List<Integer> list = new ArrayList<Integer>();
		List Result = new ArrayList();

		for (int i = 2; i <= 1000;i++)
			if (isPrime(i)) {
				count++;
				list.add(i);
			}

//		ConnectToSqlDB conn = new ConnectToSqlDB();
//			conn.insertIntegersFromArrayListToSqlTable(list,"Primes","value");
//		try {
//			Result = conn.readDataBase("Primes","values");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//
//		for (Object dbData: Result) {
//			System.out.println((int)dbData);
//		}

		for (int num: list) {
			System.out.println(num);
		}

	}

}
