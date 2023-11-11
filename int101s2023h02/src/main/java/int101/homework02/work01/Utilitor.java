package int101.homework02.work01;
import int101.homework02.work02.Person;

public class Utilitor {

    public static void main(String[] args) {
        Utilitor a = new Utilitor();

//        System.out.println("For Test");
//        System.out.println(a.testString(""));
//        System.out.println(a.testString(null));
//
//        System.out.println(a.testPositive(10));
//        System.out.println(a.testPositive(-1));

        System.out.println(a.computeIsbn10(1123456789));
        Person oneP = new Person("Theerakan", "Choochat");
        Person twoP = new Person("two", "Ltwo");
        Person threeP = new Person("three", "Ltwo");
        Person fourP = new Person("Theerakan", "Choochat");

        System.out.println(oneP.getId());
        System.out.println(twoP.getId());
        System.out.println(threeP.getId());
        System.out.println(twoP);

        System.out.println(a.equals(oneP));
        System.out.println(oneP.equals(twoP));
        System.out.println(oneP.equals(a));
        System.out.println(oneP.equals(fourP));
    }
    public static String testString(String value) {
        if (value == null) {
            throw new NullPointerException("Value can not be null.");
        } else if (value.isEmpty()) {
            throw new IllegalArgumentException("Value can not be empty.");
        }
        return value;
    }

    public static double testPositive(double value) {
        if (value >= 0) {
            return value;
        } else {
            throw new IllegalArgumentException("This " + value + "is not positive number");
        }
    }

    public static long computeIsbn10(long isbn10) {
        String numberIsbn10 = Long.toString(isbn10);
        int lenghtIsbn10 = numberIsbn10.length();
        if (lenghtIsbn10 != 9) throw new IllegalArgumentException("isbn10 must have 10 digits");

        int sum = 0;
        int countdown = 10;
        while (countdown <= 10) {
            sum += (int) (countdown * (isbn10 % 10));
            isbn10 /= 10;
            countdown--;
        }

        //calculate by mod11
        return sum % 11;
    }
}