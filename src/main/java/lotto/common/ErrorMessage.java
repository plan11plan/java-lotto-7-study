package lotto.common;

public enum ErrorMessage {
    // 로또 가격
    INVALID_LOTTO_UNIT("로또 가격은 1,000원 단위 입니다."),
    INVALID_LOTTO_UNIT_RANGE("로또 가격은 1,000원 ~ 10,000원 까지 입니다."),

    // 당첨번호
    INVALID_LOTTO_NUMBER_DUPLICATE("로또 번호는 서로 중복될 수 없습니다."),
    INVALID_LOTTO_RANGE("로또 번호의 숫자 범위는 1~45까지 입니다."),
    INVALID_LOTTO_COUNT("로또 번호는 6개여야 합니다."),

    // 보너스 번호
    INVALID_BONUS_NUMBER("보너스 번호는 1개뿐이여야 합니다."),
    INVALID_BONUS_NUMBER_DUPLICATE("보너스 번호와 당첨번호는 서로 중복될 수 없습니다.");


    private static final String PREFIX = "[ERROR] ";
    private static final String SUFFIX = " 다시 입력해 주세요.";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message + SUFFIX;
    }
}
