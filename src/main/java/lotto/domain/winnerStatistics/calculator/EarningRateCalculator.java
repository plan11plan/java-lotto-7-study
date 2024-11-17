package lotto.domain.winnerStatistics.calculator;

public class EarningRateCalculator {
    public static double calculate(int totalPrizeAmount, int lottoTotalPrice) {
        double rate = ((double) totalPrizeAmount / lottoTotalPrice) * 100;
        return Math.round(rate * 10) / 10.0;

    }
}
