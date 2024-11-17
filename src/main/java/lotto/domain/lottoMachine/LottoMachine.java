package lotto.domain.lottoMachine;

import static lotto.common.LottoRule.*;

import lotto.controller.tool.LottoNumberGenerator;

public class LottoMachine {
    public static PickedLottos picksBy(int fee, LottoNumberGenerator lottoNumberGenerator) {
        int quantity = toLottoQuantity(fee);

        return new PickedLottos(lottoNumberGenerator.generate(quantity));
    }

    private static int toLottoQuantity(int fee) {
        int quantity = fee / LOTTO_PRICE.getCriteria();
        return quantity;
    }

}
