package lotto.controller;

import lotto.domain.lottoMachine.PickedLottos;
import lotto.domain.winnerStatistics.WinnerInfo;

public class ConsoleOutputView {
    public void responseFee(int fee) {

    }

    public void responsePickedLottos(PickedLottos lottos) {
        System.out.println(lottos.getLottoSize());


    }

    public void responseWinnerInfo(WinnerInfo winnerInfo) {

    }

}
