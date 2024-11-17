package lotto.controller.execute;

import lotto.controller.view.ConsoleInputView;
import lotto.controller.view.ConsoleOutputView;
import lotto.controller.tool.LottoNumberGenerator;
import lotto.domain.lottoMachine.LottoMachine;
import lotto.domain.lottoMachine.PickedLottos;

public class PickLottoController {
    private final LottoNumberGenerator lottoNumberGenerator;

    public PickLottoController(LottoNumberGenerator lottoNumberGenerator){
        this.lottoNumberGenerator = lottoNumberGenerator;
    }

    public PickedLottos execute(ConsoleInputView inputView, ConsoleOutputView outputView) {
        int fee = inputView.requestFee();

        PickedLottos lottos = LottoMachine.picksBy(fee,lottoNumberGenerator);

        outputView.responsePickedLottos(lottos);
        return lottos;
    }
}
