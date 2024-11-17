package lotto.controller.tool;

import java.util.List;

public interface LottoNumberGenerator {
    List<List<Integer>> generate(int quantity);
}
