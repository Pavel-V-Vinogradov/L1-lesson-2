public class HomeWork {
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        boolean inRange = checkingInRange(a, b);
        printResultCheckingInRange(a, b, inRange);

        a = -123;
        b = 12;
        inRange = checkingInRange(a, b);
        printResultCheckingInRange(a, b, inRange);

        isPositiveNumber(-554);
        isPositiveNumber(0);
        isPositiveNumber(5);

        int n = 3;
        System.out.println("\nпечатаем строку test " + n + " раз(а)");
        printingString("test", n);

        System.out.println("Год " + 1900 + (checkIsLeapYear(1900) ? "высокосный" : " НЕвысокосный"));
        System.out.println("Год " + 2022 + (checkIsLeapYear(2022) ? "высокосный" : " НЕвысокосный"));

        for( int year = 1992; year < 2036; year++ ) {
            if(checkIsLeapYear(year)) {
                System.out.println("Год " + year + " высокосный");
            }
        }
    }

    private static boolean checkIsLeapYear(int year) {
        boolean isLeapYear = false;

        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        return isLeapYear;
    }
    private static void printingString(String s, int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    private static void printResultCheckingInRange(int a, int b, boolean inRange) {
        System.out.println(
                (a < 0 ? "("+a + ")" : a)
                + " + "
                + (b < 0 ? "("+b + ")" : b)
                + (inRange ? " в диапазоне " : " вне диапазона ")
                + "от 10 до 20");
    }

    private static void isPositiveNumber(int number) {
        if(number >= 0) {
            System.out.println("передали положительное число " + number);
        } else {
            System.out.println("передали отрицательное число " + number);
        }
    }

    private static boolean checkingInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


}
