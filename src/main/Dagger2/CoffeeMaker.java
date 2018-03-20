class Coffee {

}

public class CoffeeMaker {

    Coffee makeCofee() {
        return new Coffee();
    }

    public static void main(String[] args) {
        Coffee cofee = new CoffeeMaker().makeCofee();
        System.out.println(cofee);
    }
}
