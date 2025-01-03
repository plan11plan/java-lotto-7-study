package lotto.controller;

import lotto.controller.tool.RandomLottoNumberGenerator;
import lotto.controller.view.ConsoleInputView;
import lotto.controller.view.ConsoleOutputView;
import lotto.domain.lottoMachine.PickedLottos;
import lotto.domain.prizeMachine.PickedWinnerLottos;
import lotto.controller.execute.CompileWinnerController;
import lotto.controller.execute.PickLottoController;
import lotto.controller.execute.PickWinnerLottoController;

public class GameController {
    private final ConsoleInputView inputView;
    private final ConsoleOutputView outputView;
    private final PickLottoController pickLottoController;
    private final PickWinnerLottoController pickWinnerLottoController;
    private final CompileWinnerController compileWinnerController;


    public GameController() {
        this.inputView = new ConsoleInputView();
        this.outputView = new ConsoleOutputView();
        this.pickLottoController = new PickLottoController(
                new RandomLottoNumberGenerator()
        );
        this.pickWinnerLottoController = new PickWinnerLottoController();
        this.compileWinnerController = new CompileWinnerController();
    }


    public void run(){
        // 구입 금액 입력 -> 로또 뽑기
        PickedLottos pickedLottos = pickLottoController.execute(inputView,outputView);


        // 당첨 번호 입력, 보너스 번호 입력 -> 당첨 번호 생성
        PickedWinnerLottos pickedWinnerLottos = pickWinnerLottoController.execute(inputView);

        // -> 당첨 계산
        compileWinnerController.execute(outputView,pickedLottos,pickedWinnerLottos);

    }
}
