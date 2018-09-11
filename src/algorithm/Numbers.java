package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
//		int [] num = new int[1000000];
//		storeRandomNumbers(num);
//		//ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//		//Selection Sort
//		Sort algo = new Sort();
//		algo.selectionSort(num);
//		long selectionSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
//        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
//        printValue(numbers);
//		int n = num.length;
//		randomize (num, n);
//		//Insertion Sort
//		algo.insertionSort(num);
//		long insertionSortExecutionTime = algo.executionTime;
//		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		//By following above, Continue for rest of the Sorting Algorithm....




		//Come to conclusion about which Sorting Algo is better in given data set.
		System.out.println("this might take a while ..Please be patient\n");
		int[] num = new int[1000000];
		storeRandomNumbers(num);
		Sort algo = new Sort();
		algo.selectionSort(num);
		//long SortExecutionTime = algo.executionTime;
     	System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + algo.executionTime + " milli sec");
//		for (int el: num) {
//			System.out.print(el + " ");
//		}
		int n = num.length;
		randomize (num, n);

		// buble sort
		algo.bubbleSort(num);
		//long SortExecutionTime = algo.executionTime;
		System.out.println("\n\nTotal Execution Time of "+ num.length + " numbers in bubble Sort take: " + algo.executionTime + " milli sec");
//		for (int el: num) {
//			System.out.print(el + " ");
//		}

		randomize (num, n);

		// insertion sort
		algo.insertionSort(num);
		//long SortExecutionTime = algo.executionTime;
		System.out.println("\n\nTotal Execution Time of "+ num.length + " numbers in insertion Sort take: " + algo.executionTime + " milli sec");
//		for (int el: num) {
//			System.out.print(el + " ");
//		}

		randomize (num, n);

		// merge sort
		algo.mergesort(num,0,n-1);
		//long SortExecutionTime = algo.executionTime;
		System.out.println("\n\nTotal Execution Time of "+ num.length + " numbers in MergeSort take: " + algo.executionTime + " milli sec");
//		for (int el: num) {
//			System.out.print(el + " ");
//		}

		randomize (num, n);

		// Quicksort
		algo.Quicksort(num,0,n-1);
		//long SortExecutionTime = algo.executionTime;
		System.out.println("\n\nTotal Execution Time of "+ num.length + " numbers in QuickSort take: " + algo.executionTime + " milli sec");
//		for (int el: num) {
//			System.out.print(el + " ");
//		}
		n = num.length;
		randomize (num, n);

		// Bucketsort
		int returnArray[] = algo.bucketsort(num,1000000);
		//long SortExecutionTime = algo.executionTime;
		System.out.println("\n\nTotal Execution Time of "+ num.length + " numbers in BucketSort take: " + algo.executionTime + " milli sec");
//		for (int el: returnArray) {
//			System.out.print(el + " ");
//		}
		System.out.println("\nBased on the average runtime from each of these Algorithms I have concluded that BucketSort is the fastest sorting algorithm for large datasets");
	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
