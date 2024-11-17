package lotto.domain.lottoMachine;

import java.util.List;
import lotto.domain.prizeMachine.PickedWinnerLottos;
import lotto.domain.prizeMachine.PrizeLotto;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    // TODO: 추가 기능 구현
    @Override
    public String toString() {
        return numbers.toString()
                .replace("[", "")
                .replace("]", "");
    }



    public MatchResult matchCount(final PickedWinnerLottos winnerLottos) {
        // 이렇게 매치되는 것을 카운트 하는거 새로 배움.
        int matchCount = (int) numbers.stream()
                .filter(winnerLottos.getPrizeLotto()::contains)
                .count();
        boolean hasBonus = numbers.contains(winnerLottos.getBonusLotto());

        return new MatchResult(matchCount,hasBonus);
    }
}
