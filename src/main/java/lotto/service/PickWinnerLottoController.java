package lotto.service;

import java.util.List;
import lotto.controller.ConsoleInputView;
import lotto.controller.ConsoleOutputView;
import lotto.domain.prizeMachine.PickedWinnerLottos;

public class PickWinnerLottoController {
    public PickedWinnerLottos execute(ConsoleInputView inputView, ConsoleOutputView outputView) {
        List<Integer> prizeLottos = inputView.requestPrizeLottos();
        int bonusLotto = inputView.requestBonusLotto();
        return new PickedWinnerLottos(prizeLottos,bonusLotto);
    }
}
