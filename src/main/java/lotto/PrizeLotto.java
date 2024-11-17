package lotto;

import java.util.List;

public class PrizeLotto {
    private final List<Integer> prizeLotto;
    public PrizeLotto(List<Integer> prizeLotto) {
        this.prizeLotto = prizeLotto;
    }


    public List<Integer> getPrizeLotto() {
        return prizeLotto;
    }

    public boolean hasNumber(int number){
        return prizeLotto.contains(number);
    }
}
