package 템플릿_가져온것들.util;

import java.util.List;

public class RangeValidator {
    private RangeValidator() {
    }

    public static boolean isNumberInRange(int number, int min, int max) {
        return number >= min && number <= max;
    }
    // 새로 다시 공부 하게 된 부분. allMatch ( boolean 타입을 반환할때는 allMatch)
    public static boolean isNumberInRange(List<Integer> numbers, int min, int max) {
        return numbers.stream()
                .allMatch(num -> isNumberInRange(num, min, max));
    }
//    public static boolean isNumberInRange(List<Integer> numbers, int min, int max){
//        return numbers.stream().forEach(num-> isNumberInRange(num,min,max));
//    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

}
