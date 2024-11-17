package lotto.controller.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static lotto.common.ErrorMessage.*;
import static lotto.common.LottoRule.*;
import static 템플릿_가져온것들.util.RangeValidator.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import 템플릿_가져온것들.if_throw.common.validation.Validator;

/**
 * ## 입력
 *
 *
 * ### 당첨 번호
 * - 로또 번호는 서로 중복될 수 없습니다.
 * - 로또 번호의 숫자 범위는 1~45까지 입니다.
 * - 로또 번호는 6개여야 합니다.
 *
 * ### 보너스 번호
 * - 보너스 번호는 1개뿐이여야 합니다.
 * - 로또 번호는 서로 중복될 수 없습니다.
 * - 보너스 번호와 당첨번호는 서로 중복될 수 없습니다.
 * - 로또 번호의 숫자 범위는 1~45까지 입니다.
 *
 */
public class ConsoleInputView {
    private final String DELIMITER_COMMA =",";
    /**
     * -[x] 로또 가격은 1,000원 ~ 10,000원 까지 입니다.
     * -[x] 로또 가격은 1,000원 단위 입니다.
     */
    public int requestFee() {
        int fee = Integer.parseInt(consoleRead());
        Validator
                .check(isNumberInRange(fee, BUY_MIN_PRICE.getCriteria(), BUY_MAX_PRICE.getCriteria()))
                .withError(new IllegalArgumentException(INVALID_LOTTO_UNIT_RANGE.getMessage()))

                .check((fee % 1000) != 0)
                .withError(new IllegalArgumentException(INVALID_LOTTO_UNIT.getMessage()))
                .validate();
        System.out.print(System.lineSeparator());
        return fee;
    }

    /**
     * 당첨 번호
     *  - 로또 번호는 6개여야 합니다.
     *  - 로또 번호의 숫자 범위는 1~45까지 입니다.
     *  - 로또 번호는 서로 중복될 수 없습니다.
     */
    public List<Integer> requestPrizeLottos() {
        List<Integer> prizeLottos = Arrays.stream(consoleRead().trim().split(DELIMITER_COMMA))
                .map(Integer::parseInt)
                .toList();
        Validator
                .check(prizeLottos.size() != LOTTO_SIZE.getCriteria())
                .withError(new IllegalArgumentException(INVALID_LOTTO_COUNT.getMessage()))

                .check(isNumberInRange(prizeLottos, LOTTO_MIN_VALUE.getCriteria(), LOTTO_MAX_VALUE.getCriteria()))
                .withError(new IllegalArgumentException(INVALID_LOTTO_RANGE.getMessage()))

                .check(new HashSet<>(prizeLottos).size() != LOTTO_SIZE.getCriteria())
                .withError(new IllegalArgumentException(INVALID_LOTTO_NUMBER_DUPLICATE.getMessage()))
                .validate();
       return prizeLottos;
    }

    /**
     *  보너스 번호
     *  [자동x] 보너스 번호는 1개뿐이여야 합니다.
     *  [도메인에서 구현] 보너스 번호와 당첨번호는 서로 중복될 수 없습니다.
     *  [x] 로또 번호의 숫자 범위는 1~45까지 입니다.
     */

    public int requestBonusLotto() {
        int bonusLotto = Integer.parseInt(consoleRead());
        Validator
                .check(isNumberInRange(bonusLotto,LOTTO_MIN_VALUE.getCriteria(), LOTTO_MAX_VALUE.getCriteria()))
                .withError(new IllegalArgumentException(INVALID_LOTTO_RANGE.getMessage()))
                .validate();
        return bonusLotto;
    }

    private String consoleRead(){
        return readLine().trim();
    }
}
