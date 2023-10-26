package abstractclass03;

public class ChefTest {
    public static void main(String[] args) {
        Chef[] chefs = new Chef[2];
        // 다형성을 통해 아래와 같이 작성 가능
        chefs[0] = new KFoodChef();
        chefs[1] = new JFoodChef();
        
        for (Chef chef: chefs) {
            chef.eat();
            chef.cook();
        }
    }
}
