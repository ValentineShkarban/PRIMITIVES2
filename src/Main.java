public class Main {
    public static void main(String[] args) {
        int initialAccount = 1300;
        int addend = 130;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;

        }
        int finalAccount = initialAccount + addend + bonus;
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счёт: " + finalAccount);
    }
}