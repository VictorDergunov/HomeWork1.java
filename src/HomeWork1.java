public class HomeWork1 {
    public static void main(String[] args) {
        byte b = 1;
        short sh = -129;
        int i = 12;
        float f = 1.2f;
        double d = 22.23;
        boolean bool = true;
        long l = 12344567;
        char ch = 'r';

        System.out.println(sum(3, 5, 7, 10));
        System.out.println(condition(6, 12));
        positiveOrNegative(2);
        positiveOrNegative(-3);
        isPositive(8);
        isPositive(-3);
        getString("Виктор");
        leapYear(2012);
        leapYear(1997);
    }
    public static double sum (double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    public static boolean condition (int x, int y){
       return (x + y >= 10) & (x + y <= 20);
    }

    public static void positiveOrNegative (int x){
        if(x >= 0)
            System.out.println("Введено положительное число: " + x);
        else
            System.out.println("Введено отрицательное число: " + x);
    }

    public static boolean isPositive (int x){
        if(x >= 0) {
            return true;
        }
        return false;
    }

    public static void getString (String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear (int year){
        if((year % 4 == 0) || (year % 100 == 0) && !(year % 400 == 0)){
            System.out.println("Введенный вами год является высокосный!");
        } else System.out.println("Выеденный вами год не является высокосным!");
    }
}
