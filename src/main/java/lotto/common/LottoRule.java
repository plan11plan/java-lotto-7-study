package lotto.common;

public enum LottoRule {

    LOTTO_SIZE(6),
    BUY_MIN_PRICE(1000),
    BUY_MAX_PRICE(10_000),
    LOTTO_PRICE(1000),
    LOTTO_MIN_VALUE(1),
    LOTTO_MAX_VALUE(45);


    private final int criteria;

    LottoRule(int criteria) {
        this.criteria = criteria;
    }

    public int getCriteria() {
        return criteria;
    }

}
