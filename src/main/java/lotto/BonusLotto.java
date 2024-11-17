package lotto;

import 템플릿_가져온것들.if_throw.common.validation.Validator;

public class BonusLotto {
    private final int value;

    private BonusLotto(int value) {
        this.value = value;
    }

    public BonusLotto of(int value, PrizeLotto prizeLotto){
        Validator.check(prizeLotto.hasNumber(value))
                .withError(new IllegalArgumentException(ErrorMessage.INVALID_BONUS_NUMBER_DUPLICATE.getMessage()))
                .validate();
        return new BonusLotto(value);
    }

}
