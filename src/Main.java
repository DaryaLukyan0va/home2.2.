public class Main {
    public static void main(String[] args) {
    int first = 100;
    int topUpBalance = 10;
    int bonus = 0;

           if ( topUpBalance > 1000 ) {
               bonus = (topUpBalance / 100);}

    int total = (bonus + first + topUpBalance);

        System.out.println("У Вас на счету " + total + "руб.");
        System.out.println("Бонусы " + bonus + "руб.");

    }
}

