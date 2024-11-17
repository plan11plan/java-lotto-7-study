package lotto.domain.prizeMachine;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class PickedWinnerLottos {
    private final PrizeLotto prizeLotto;
    private final BonusLotto bonusLotto;
    public PickedWinnerLottos(final List<Integer> rawPrizeLottos, final int rawBonusLotto) {
        this.prizeLotto = new PrizeLotto(rawPrizeLottos);
        this.bonusLotto = BonusLotto.of(rawBonusLotto,prizeLotto);

    }

    public PrizeLotto getPrizeLotto() {
        return prizeLotto;
    }

    public BonusLotto getBonusLotto() {
        return bonusLotto;
    }
}
