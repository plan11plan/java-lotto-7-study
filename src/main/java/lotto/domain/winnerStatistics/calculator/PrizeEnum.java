package lotto.domain.winnerStatistics.calculator;

import java.util.Arrays;

public enum PrizeEnum {


    FIRST(6, false, 2_000_000_000),
    SECOND(5, true, 30_000_000),
    THIRD(5, false, 1_500_000),
    FOURTH(4, false, 50_000),
    FIFTH(3, false, 5_000),
    NONE(0, false, 0);
    private final int matchPrizeCount;
    private final boolean hasBonus;
    private final int prizeAmount;

    PrizeEnum(int matchPrizeCount, boolean hasBonus, int prizeAmount) {
        this.matchPrizeCount = matchPrizeCount;
        this.hasBonus = hasBonus;
        this.prizeAmount = prizeAmount;
    }

    public static PrizeEnum of(int matchingNumbers, boolean isBonusMatched) {
        return Arrays.stream(values())
                .filter(prize -> hasMatchingNumberCount(prize, matchingNumbers))
                .filter(prize -> isValidBonusMatch(prize, matchingNumbers, isBonusMatched))
                .findFirst()
                .orElse(NONE);
    }

    private static boolean hasMatchingNumberCount(PrizeEnum prize, int matchingNumbers) {
        return prize.matchPrizeCount == matchingNumbers;
    }

    private static boolean isValidBonusMatch(PrizeEnum prize, int matchingNumbers, boolean isBonusMatched) {
        if (matchingNumbers != SECOND.matchPrizeCount) {
            return true;
        }
        return prize.hasBonus == isBonusMatched;
    }

    public int getPrizeAmount() {
        return prizeAmount;
    }

    public int getMatchPrizeCount() {
        return matchPrizeCount;
    }

}

