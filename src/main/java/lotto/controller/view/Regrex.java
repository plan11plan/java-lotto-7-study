package lotto.controller.view;

public enum Regrex {

    OPEN_SQUARE_BRACKET("["),
    CLOSE_SQUARE_BRACKET("]"),
    COMMA(","),
    COMMA_WITH_SPACE(", ");

    private final String value;

    Regrex(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
