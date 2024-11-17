package lotto.controller.view;

import lotto.domain.lottoMachine.PickedLottos;
import lotto.domain.winnerStatistics.WinnerInfo;
import lotto.domain.winnerStatistics.calculator.MatchResult;
import lotto.domain.winnerStatistics.calculator.PrizeEnum;

public class ConsoleOutputView {

    public void responsePickedLottos(PickedLottos lottos) {
        System.out.println(lottos.getLottoSize() + "개를 구매했습니다.");
        lottos.getLottos().forEach(lotto ->
                System.out.println(
                        Regrex.OPEN_SQUARE_BRACKET.getValue()
                        + lotto
                        + Regrex.CLOSE_SQUARE_BRACKET.getValue()
                )
        );
        System.out.print(System.lineSeparator());
    }

    public void responseWinnerInfo(WinnerInfo winnerInfo) {
        System.out.println(System.lineSeparator()+"당첨 통계");
        System.out.println(Regrex.THREE_DASH.getValue());

        printPrizeStatistics(winnerInfo.matchResult());

        printEarningProfit(winnerInfo.earningRate());

    }

    private void printEarningProfit(double earningRate) {
        System.out.println("총 수익률은 "+ earningRate+"%입니다.");
    }


    private void printPrizeStatistics(MatchResult result) {

        PrizeEnum[] prizes = {
                PrizeEnum.FIFTH,
                PrizeEnum.FOURTH,
                PrizeEnum.THIRD,
                PrizeEnum.SECOND,
                PrizeEnum.FIRST
        };

        for (PrizeEnum prize : prizes) {
            printPrizeResult(prize, result.getCountByPrize(prize));
        }
    }

    private void printPrizeResult(PrizeEnum prize, int count) {
        if (prize == PrizeEnum.SECOND) {
            System.out.printf("5개 일치, 보너스 볼 일치 (%,d원) - %d개\n",
                    prize.getPrizeAmount(),
                    count
            );
            return;
        }

        System.out.printf("%d개 일치 (%,d원) - %d개\n",
                prize.getMatchPrizeCount(),
                prize.getPrizeAmount(),
                count
        );
    }


}
