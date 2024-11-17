package lotto.domain.winnerStatistics.calculator;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

// 이 부분에서 시간 많이 잡아 먹힘. 포맷에는 모든 등수가 찍혀야하는데, 나는 자꾸 리스트가 편해서 리스트로 생각하려고 했음.
// 그러다가 이넘맵을 사용해야하는데, 이넘맵은 익숙치 않아서 계속 찾아봐서 시간이 많이 걸리게 됨.
public class MatchResult {
    private final Map<PrizeEnum, Integer> prizeResults;
    private final int totalPrizeAmount;

    public MatchResult(List<PrizeEnum> results) {
        this.prizeResults = calculatePrizeResults(results);
        this.totalPrizeAmount = calculateTotalPrizeAmount();
    }


    private Map<PrizeEnum, Integer> calculatePrizeResults(List<PrizeEnum> results) {
        Map<PrizeEnum, Integer> prizeResults = initializeResults();
        countPrizeResults(results, prizeResults);
        return prizeResults;
    }

    // View 요구사항 때문에, Map으로 전체 초기화해서 등수별 저장해놓음. 만약 등수 당첨 안된거가 있어도 출력해야하기 때문에,이렇게 해놓음.
    private Map<PrizeEnum, Integer> initializeResults() {
        Map<PrizeEnum, Integer> prizeResults = new EnumMap<>(PrizeEnum.class);

        for (PrizeEnum prize : PrizeEnum.values()) {
            if (prize != PrizeEnum.NONE) {
                prizeResults.put(prize, 0);
            }
        }
        return prizeResults;
    }

    private void countPrizeResults(List<PrizeEnum> results, Map<PrizeEnum, Integer> prizeResults) {
        results.stream()
                .filter(result -> result != PrizeEnum.NONE)
                .forEach(result -> prizeResults.merge(result, 1, Integer::sum));
    }

    private int calculateTotalPrizeAmount() {
        return prizeResults.entrySet().stream()
                .mapToInt(entry -> entry.getKey().getPrizeAmount() * entry.getValue())
                .sum();
    }

    public int getCountByPrize(PrizeEnum prizeEnum) {
        return prizeResults.getOrDefault(prizeEnum, 0);
    }

    public int getTotalPrizeAmount() {
        return totalPrizeAmount;
    }

    public Map<PrizeEnum, Integer> getPrizeResults() {
        return new EnumMap<>(prizeResults);
    }
}
