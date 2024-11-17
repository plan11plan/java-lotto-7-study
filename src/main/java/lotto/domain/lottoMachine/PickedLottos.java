package lotto.domain.lottoMachine;

import java.util.List;
import java.util.stream.Collectors;

public class PickedLottos {
    List<Lotto> lottos;
    public PickedLottos(final List<List<Integer>> generate) {
        this.lottos = generate.stream()
                .map(Lotto::new)
                .toList();
    }
}
