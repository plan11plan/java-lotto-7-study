package lotto.domain.prizeMachine;

import java.util.List;

public class PrizeLotto {
    private final List<Integer> prizeLotto;
    public PrizeLotto(List<Integer> prizeLotto) {
        this.prizeLotto = prizeLotto;
    }

    public boolean hasNumber(int number){
        return prizeLotto.contains(number);
    }

    public boolean contains(int number) {
        return prizeLotto.contains(number);
    }
}
