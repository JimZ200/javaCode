import java.util.Scanner;
public class JavaClassAndObject {
    private String make;
    private String model;
    private int year;

    JavaClassAndObject(String model, String make, int year){
       this.setModel(model);
       this.setYear(year);
       this.setMake(make);
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }


    //All the things below can be put into the constructor
    public void setMake(String make){

        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }


}