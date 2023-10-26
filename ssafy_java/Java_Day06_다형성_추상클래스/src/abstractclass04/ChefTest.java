package abstractclass04;

public class ChefTest {
    public static void main(String[] args) {
        JFoodChef j = new JFoodChef();
//      KFoodChef k = new KFoodChef(); // 추상 클래스 이므로 불가능
        Chef c = new JFoodChef();
        c.cook();
        
        Chef c2 = new Chef() {
            @Override
            public void cook() {
                System.out.println("아무 요리나 만든다.");
            }
        };
        c2.cook();
    }
}
