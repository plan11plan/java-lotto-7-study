package 템플릿_가져온것들.util;

public class RangeValidator {
    private RangeValidator() {
    }

    public static boolean isNumberInRange(int number, int min, int max) {
        return number >= min && number <= max;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

}
