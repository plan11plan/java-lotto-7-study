package lotto;

import java.util.List;

public class GameController {
    private final ConsoleInputView inputView;
    private final ConsoleOutputView outputView;

    public GameController() {
        this.inputView = new ConsoleInputView();
        this.outputView = new ConsoleOutputView();
    }

    void run(){
        // 구입 금액 입력
        int fee = inputView.requestFee();
        outputView.responseFee(fee);

        // 로또 뽑기
        PickedLottos lottos = LottoMachine.picksBy(fee);
        outputView.responsePickedLottos(lottos);

        // 당첨 번호 입력, 보너스 번호 입력 -> 당첨 계산
        List<Integer> prizeLottos = inputView.requestPrizeLottos();
        int bonusLotto = inputView.requestBonusLotto();

        WinnerInfo winnerInfo = WinnerStatistics.compile(prizeLottos,bonusLotto,lottos);
        outputView.responseWinnerInfo(winnerInfo);

    }
}
