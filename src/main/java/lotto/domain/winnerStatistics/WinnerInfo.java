package lotto.domain.winnerStatistics;

import lotto.domain.winnerStatistics.calculator.MatchResult;

public record WinnerInfo(
        MatchResult matchResult,
        double earningRate
){
}
