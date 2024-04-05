import java.util.Scanner;
public class nameAndAge {
   private String name;
   private int age;
    nameAndAge(){
        String school = "West";
    }

    public void name(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter name");
        name = s1.nextLine();
        System.out.println("Enter age");
        age = s1.nextInt();

        System.out.println(getName() + getAge());
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
