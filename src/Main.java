public class Main {
    public static void main(String[] args) {

        int initilAmount = 200;
        int replenishment = 2000;

        int bonus;
        int finalAmount;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
            finalAmount = replenishment + initilAmount + bonus;
        } else {
            bonus = 0;
            finalAmount = initilAmount + replenishment;
        }

        System.out.println(finalAmount + " итоговый счет");
        System.out.println(bonus + " бонусных рублей");
    }
}