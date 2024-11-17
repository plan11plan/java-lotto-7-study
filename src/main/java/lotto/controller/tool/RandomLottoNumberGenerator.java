package lotto.controller.tool;

import static lotto.common.LottoRule.*;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lotto.common.LottoRule;

public class RandomLottoNumberGenerator implements LottoNumberGenerator{
    private final int startInclusive = LOTTO_MIN_VALUE.getCriteria();
    private final int endInclusive = LOTTO_MAX_VALUE.getCriteria();
    private final int count = LOTTO_SIZE.getCriteria();


    @Override
    public List<List<Integer>> generate(int quantity) {
        return IntStream.range(0, quantity)
                .mapToObj(i -> generateSingleLotto())
                .collect(Collectors.toList());
    }

    private List<Integer> generateSingleLotto() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(
                startInclusive,
                endInclusive,
                count
        );
        return numbers.stream()
                .sorted()
                .toList();
    }
}
