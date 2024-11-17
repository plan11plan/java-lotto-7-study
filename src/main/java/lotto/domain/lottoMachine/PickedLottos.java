package lotto.domain.lottoMachine;

import java.util.List;
import java.util.stream.Collectors;
import lotto.common.LottoRule;

public class PickedLottos {
    private final List<Lotto> lottos;
    public PickedLottos(final List<List<Integer>> generate) {
        this.lottos = generate.stream()
                .map(Lotto::new)
                .toList();
    }

    public int getLottoSize(){
        return lottos.size();
    }

    public List<Lotto> getLottos() {
        return lottos;
    }
    public int getLottoTotalPrice(){
        return getLottoSize() * LottoRule.LOTTO_PRICE.getCriteria();
    }
}
