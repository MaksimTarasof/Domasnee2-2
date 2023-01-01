public class Main {
    public static void main(String[] args) {

        int balans = 100;
        int popolnenie = 1500;
        int bonus = popolnenie / 100;
        if (popolnenie >= 1000) {
            System.out.println("Kоличество бонусных рублей " + bonus);
            System.out.println("Итоговый счёт " + (balans + popolnenie + bonus));
        } else {
            System.out.println("Итоговый счёт " + (balans + popolnenie));
        }
    }
}