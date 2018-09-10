package design;

public abstract class Person {

    private double height;
    private String ethnicity;
    public static final String species = "HomoSapien";

    public Person(double height, String ethnicity) {
        this.height = height;
        this.ethnicity = ethnicity;
    }

    public Person(){

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public void job(){
        System.out.println("I work from 9 am to 5pm");
    }

    public abstract void groceryBudget();

    public  void function(){
        System.out.println("I need to sleep and eat");
    }
}
