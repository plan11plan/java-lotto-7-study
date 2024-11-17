package lotto.controller.execute;

import lotto.controller.view.ConsoleInputView;
import lotto.controller.view.ConsoleOutputView;
import lotto.domain.lottoMachine.PickedLottos;
import lotto.domain.prizeMachine.PickedWinnerLottos;
import lotto.domain.winnerStatistics.WinnerInfo;
import lotto.domain.winnerStatistics.WinnerStatistics;

public class CompileWinnerController {
    public void execute(ConsoleOutputView outputView,
                        PickedLottos pickedLottos,
                        PickedWinnerLottos pickedWinnerLottos
    ) {
        WinnerInfo winnerInfo = WinnerStatistics.compile(pickedLottos,pickedWinnerLottos);
        outputView.responseWinnerInfo(winnerInfo);
    }
}

