package lotto.domain.winnerStatistics;

import lotto.domain.lottoMachine.PickedLottos;
import lotto.domain.prizeMachine.PickedWinnerLottos;
import lotto.domain.winnerStatistics.calculator.EarningRateCalculator;
import lotto.domain.winnerStatistics.calculator.LottoMatchCaculator;
import lotto.domain.winnerStatistics.calculator.MatchResult;

public class WinnerStatistics {


    public static WinnerInfo compile(PickedLottos pickedLottos, PickedWinnerLottos pickedWinnerLottos) {
        // 매치 결과
        MatchResult matchResult = LottoMatchCaculator.calculate(pickedLottos, pickedWinnerLottos);
        // 수익률 결과
        double earningRate = EarningRateCalculator.calculate(matchResult.getTotalPrizeAmount(),
                pickedLottos.getLottoTotalPrice());
        // 종합 반환
        return new WinnerInfo(matchResult,earningRate);
    }
}
