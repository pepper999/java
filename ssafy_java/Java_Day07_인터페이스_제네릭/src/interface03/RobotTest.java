package interface03;

interface Movalbe {
    public abstract void move();
}

interface Cookable {
    public abstract void cook();
}

interface Chef extends Movalbe, Cookable {
    
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

}
