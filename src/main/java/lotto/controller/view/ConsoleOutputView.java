package lotto.controller.view;

import lotto.controller.view.Regrex;
import lotto.domain.lottoMachine.PickedLottos;
import lotto.domain.winnerStatistics.WinnerInfo;

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

    }

}
