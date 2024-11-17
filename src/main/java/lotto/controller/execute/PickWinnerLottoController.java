package lotto.controller.execute;

import java.util.List;
import lotto.controller.view.ConsoleInputView;
import lotto.domain.prizeMachine.PickedWinnerLottos;

public class PickWinnerLottoController {
    public PickedWinnerLottos execute(ConsoleInputView inputView) {
        List<Integer> prizeLottos = inputView.requestPrizeLottos();
        int bonusLotto = inputView.requestBonusLotto();

        return new PickedWinnerLottos(prizeLottos,bonusLotto);
    }

}
