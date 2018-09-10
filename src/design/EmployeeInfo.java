package design;

import java.util.Scanner;

public class EmployeeInfo extends Person implements Employee{

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private int id;
	private String name;
	private String dept;
	public static int Salary = 65000;



	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
         this.id = employeeId;
	}
	public EmployeeInfo(String name, int employeeId){
           this.name = name;
           this.id = employeeId;
	}

	public EmployeeInfo(String name, int employeeId,float height,String ethnicity){
		super(height, ethnicity);
		this.name = name;
		this.id = employeeId;
	}


	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){
		double performence = 0;
		if (numberOfYearsWithCompany >= 10){
			performence = .10;
		}else if (numberOfYearsWithCompany < 10 && numberOfYearsWithCompany >= 5){
			performence = .05;
		}else if (numberOfYearsWithCompany < 5 && numberOfYearsWithCompany >=0 ){
			performence = .02;
		}
		int total = (int) (Salary + Salary * performence);
		return total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		int years = Integer.parseInt(convertedTodaysDate.substring(convertedTodaysDate.indexOf('/')+1,convertedTodaysDate.length()))- Integer.parseInt(convertedJoiningDate.substring(convertedJoiningDate.indexOf('/')+1,convertedJoiningDate.length()));

		//Calculate pension
		double pension = .05;
		for(int i = 0; i< years;i++){
			pension += .05;
		}
        total= (int) (Salary*pension);
		return total;
	}

	@Override
	public int employeeId() {
		return this.id;
	}

	@Override
	public String employeeName() {
		return this.employeeName();
	}

	@Override
	public void assignDepartment() {
		System.out.println("Employee is in Department Level 1");
	}


	@Override
	public int calculateSalary() {
		return this.Salary ;
	}

	@Override
	public void benefitLayout() {
		System.out.println("Employee has Dental,Medical,Stock,401k");
	}

	@Override
	public void groceryBudget() {
		System.out.println("My yearly Grocery Bill is "+(double)(this.Salary*.05)+" Dollars");
	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
