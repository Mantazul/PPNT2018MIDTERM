package design;


import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

        EmployeeInfo emp = new EmployeeInfo("jon smith",463562,5.7,"Bengali");

        Assert.assertEquals(5.7,emp.getHeight());
        Assert.assertEquals(65000,emp.calculateSalary());
        Assert.assertEquals("I work from 9 am to 5pm",emp.job());
        Assert.assertEquals(91000,emp.calculateEmployeePension());
        Assert.assertEquals((double) 13000,emp.calculateEmployeeBonus());
        Assert.assertEquals(3250.0,emp.groceryBudget());
        Assert.assertEquals("I dont need sleep ,I need to work",emp.function());
    }
}
