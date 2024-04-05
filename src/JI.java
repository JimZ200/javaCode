class bird{
    public void sing(){
        System.out.println("tweet");
    }
}

class robin extends bird{
    public void sing(){
        System.out.println("Twiddle");
    }
}

class pelican extends bird{
    public void sing(){
        System.out.println("TTT");
    }
}

class bird2 extends bird{
    public void sing(){
        System.out.println("RRR");
    }
}

public class JI {
    public static void main(String[] args) {
      robin r = new robin();
      pelican p = new pelican();
      bird2 b2 = new bird2();
      bird b = new bird();

      bird[] bird3 = {b,r,p,b2};

        for (int i = 0; i < bird3.length; i++) {
            bird3[i].sing();

        }

    }
}
