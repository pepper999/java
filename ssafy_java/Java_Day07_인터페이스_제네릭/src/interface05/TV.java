package interface05;

public class TV implements HdmiOutput{
    @Override
    public void output() {
        System.out.println("TV로 출력");
    }
}
