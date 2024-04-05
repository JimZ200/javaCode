
class outerClass{
    int number = 6;
    public void heyThere(){
        System.out.println("Hey there");
    }
    public class innerClass{
        int innerNumber = 8;
        public void whatsUp(){
            System.out.println("Hey");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
       outerClass out = new outerClass();
       outerClass.innerClass in = out.new innerClass();
    }
}
