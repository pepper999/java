package exception04_Applicatio_exception;

public class FruitNotFoundException extends Exception {
    public FruitNotFoundException (String name){
        super(name + "에 해당하는 과일이 없습니다.");
    }
}
