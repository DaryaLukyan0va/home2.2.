public class Main {
    public static void main(String[] args) {
    int first = 100;
    int topUpBalance = 10000;
    int bonus = (topUpBalance / 100);
    int i = (bonus + first + topUpBalance);
    int total = (topUpBalance + first);

            if ( topUpBalance > 1000 ) {
                System.out.println("У Вас на счету " + i + "руб.");
                System.out.println("Бонусы " + bonus + "руб.");
            } else {

                System.out.println("У Вас на счету " + total + "руб.");}

        }
    }

