package lotto;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static lotto.ErrorMessage.*;
import static lotto.LottoRule.*;
import static 템플릿_가져온것들.util.RangeValidator.*;

import java.util.List;
import 템플릿_가져온것들.if_throw.common.validation.Validator;
import 템플릿_가져온것들.util.RangeValidator;

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

    public List<Integer> requestPrizeLottos() {

        return null;
    }

    public int requestBonusLotto() {
        return 0;
    }

    private String consoleRead(){
        return readLine().trim();
    }
}
