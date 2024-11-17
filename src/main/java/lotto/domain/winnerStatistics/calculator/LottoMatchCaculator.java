package lotto.domain.winnerStatistics.calculator;

import java.util.List;
import lotto.domain.lottoMachine.PickedLottos;
import lotto.domain.prizeMachine.PickedWinnerLottos;

public class LottoMatchCaculator {
    public static MatchResult calculate(PickedLottos pickedLottos, PickedWinnerLottos winnerLottos) {
        List<PrizeEnum> result = pickedLottos.getLottos().stream()
                .map(lotto -> lotto.matchCount(winnerLottos))
                .map(matchResult -> PrizeEnum.of(matchResult.matchCount(), matchResult.hasBonus()))
                .toList();

        return new MatchResult(result);
    }
}
