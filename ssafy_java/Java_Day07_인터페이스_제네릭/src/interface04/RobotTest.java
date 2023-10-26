package interface04;

interface Movalbe {
    public abstract void move();
}

interface Cookable {
    public abstract void cook();
}

interface Chef extends Movalbe, Cookable {
    public default void info() {
        System.out.println("정보출력");
    }
    public static void sound() {
        System.out.println("보글보글");
    }
}

class Robot implements Chef {

    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cook() {
        // TODO Auto-generated method stub
        
    }
    
}

public class RobotTest {
    public static void main(String[] args) {
        Chef.sound();
        Robot r = new Robot();
        r.info();
    }
}
