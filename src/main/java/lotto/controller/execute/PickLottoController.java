package lotto.controller.execute;

import lotto.controller.ConsoleInputView;
import lotto.controller.ConsoleOutputView;
import lotto.domain.lottoMachine.LottoMachine;
import lotto.domain.lottoMachine.PickedLottos;

public class PickLottoController {
    public PickedLottos execute(ConsoleInputView inputView, ConsoleOutputView outputView) {
        int fee = inputView.requestFee();
        PickedLottos lottos = LottoMachine.picksBy(fee);
        outputView.responsePickedLottos(lottos);
        return lottos;
    }
}
