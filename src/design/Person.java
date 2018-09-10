package design;

public abstract class Person {

    private float height;
    private String ethnicity;
    public static final String species = "HomoSapien";

    public Person(float height, String ethnicity) {
        this.height = height;
        this.ethnicity = ethnicity;
    }

    public Person(){

    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
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
}
