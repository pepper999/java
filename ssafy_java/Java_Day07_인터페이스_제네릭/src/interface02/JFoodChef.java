package interface02;

public class JFoodChef implements Chef {
    @Override
    public void cook() {
        System.out.println("일식을 조리한다.");
    }
}