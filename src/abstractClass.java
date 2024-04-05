import java.util.Scanner;
abstract class Dog{
     private int age;
     private String name;
    public abstract void color();

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

class Mickey extends Dog{
    public void color() {
        System.out.println(getName() + "is" + " " + getAge() + " " + "years old");
    }


}
public class abstractClass {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Mickey dog = new Mickey();
        dog.setName(s1.nextLine());
        dog.setAge(s1.nextInt());
        dog.color();
    }
}