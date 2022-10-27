package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void isLeapYear(int year) {
        String result;
        result = ((year % 4 == 0 && year % 100 != 0) ? "leap" : (year % 400 == 0) ? "leap" : "not leap");
           System.out.println(result);

        }
    public static void main(String[] args) {
        isLeapYear(2019);
    }
}
