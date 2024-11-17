package lotto.controller;

import java.util.List;
import lotto.domain.lottoMachine.LottoMachine;
import lotto.domain.lottoMachine.PickedLottos;
import lotto.domain.winnerStatistics.WinnerInfo;
import lotto.domain.winnerStatistics.WinnerStatistics;

public class GameController {
    private final ConsoleInputView inputView;
    private final ConsoleOutputView outputView;

    public GameController() {
        this.inputView = new ConsoleInputView();
        this.outputView = new ConsoleOutputView();
    }

    void run(){
        // 구입 금액 입력 -> 로또 뽑기
        int fee = inputView.requestFee();
        PickedLottos lottos = LottoMachine.picksBy(fee);
        outputView.responsePickedLottos(lottos);

        // 당첨 번호 입력, 보너스 번호 입력 -> 당첨 계산
        List<Integer> prizeLottos = inputView.requestPrizeLottos();
        int bonusLotto = inputView.requestBonusLotto();

        WinnerInfo winnerInfo = WinnerStatistics.compile(prizeLottos,bonusLotto,lottos);
        outputView.responseWinnerInfo(winnerInfo);

    }
}
