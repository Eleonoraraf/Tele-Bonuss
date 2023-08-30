public class Main {
    public static void main(String[] args) {
        int replenishment = 1200; // Сумма пополнения

        if (replenishment > 1000) {
            System.out.println("Бонус:" + ( replenishment / 100 ));
        } else {
            System.out.println("Бонус:" + ( 0 ));
        }
    }
}