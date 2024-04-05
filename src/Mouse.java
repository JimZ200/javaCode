public class Mouse {
    String name;
    Mouse(String name){
        this.name = name;
    }
    public void leftClick(){
        System.out.println("Click!");
    }
    public void rightClick(){
        System.out.println("Click");
    }

    public void scrollUp(){
        System.out.println("Scroll up");
    }

    public void scrollDown(){
        System.out.println("Scroll down ");
    }
}
