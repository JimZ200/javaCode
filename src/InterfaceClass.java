import java.util.Scanner;
class rabbit implements InterfaceClass{
    @Override
   public void flee(){
        System.out.println("The rabbit is fleeing");
    }
}
/*class fish implements predator,InterfaceClass{
    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("The fish is fleeing");
    }
}
*/


class hawk implements predator{
    @Override
    public void nameAndAge(){

    }

}
interface InterfaceClass {
    void flee();
}

