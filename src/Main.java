public class Main {
    public static void main(String[] args) {
        int score = 100;
        int replenishment = 1200; // Сумма пополнения

        if (replenishment > 1000) {
            System.out.println("Бонус:" + ( (score+replenishment) / 100 ));
        } else {
            System.out.println("Бонус:" + ( 0 ));
        }
    }
}