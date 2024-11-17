package lotto.controller;

import java.util.List;
import lotto.domain.lottoMachine.LottoMachine;
import lotto.domain.lottoMachine.PickedLottos;
import lotto.domain.prizeMachine.PickedWinnerLottos;
import lotto.domain.winnerStatistics.WinnerInfo;
import lotto.domain.winnerStatistics.WinnerStatistics;
import lotto.service.CompileWinnerController;
import lotto.service.PickLottoController;
import lotto.service.PickWinnerLottoController;

public class GameController {
    private final ConsoleInputView inputView;
    private final ConsoleOutputView outputView;
    private final PickLottoController pickLottoController;
    private final PickWinnerLottoController pickWinnerLottoController;
    private final CompileWinnerController compileWinnerController;


    public GameController() {
        this.inputView = new ConsoleInputView();
        this.outputView = new ConsoleOutputView();
        this.pickLottoController = new PickLottoController();
        this.pickWinnerLottoController = new PickWinnerLottoController();
        this.compileWinnerController = new CompileWinnerController();
    }


    void run(){
        // 구입 금액 입력 -> 로또 뽑기
        PickedLottos pickedLottos = pickLottoController.execute(inputView,outputView);


        // 당첨 번호 입력, 보너스 번호 입력 -> 당첨 계산
        PickedWinnerLottos pickedWinnerLottos = pickWinnerLottoController.execute(inputView,outputView);


        WinnerInfo winnerInfo = WinnerStatistics.compile(inputView,outputView,pickedWinnerLottos,pickedWinnerLottos);

    }
}
