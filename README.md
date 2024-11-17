# java-lotto-precourse
--- 타임 스탬프 ---

18:11 시작

18:27 기능 목록 작성 완료 -> 개발 시작 

----

# 입력
// given

당첨 번호, 보너스 번호를 입력받는다.

### 요구사항 
- `로또 구입 금액`을 입력 받을 때,
    - [ ] 1,000원 단위로 입력 받아야 한다.
    - [ ] 1,000원 단위로 나누어 떨어지지 않는 경우 예외처리한다.

- `당첨 번호`를 입력 받는다. 번호는 쉼표(,)를 기준으로 구분한다.
- `보너스 번호`를 입력 받는다.

---
// when

# 로또 
- 로또 번호의 숫자 범위는 1~45까지이다.
- 1개의 로또를 발행할 때 6개의 숫자가 있다. 이때 중복되지 않는 숫자들이다.
- 로또 1장의 가격은 1,000원이다.
# 로또 머신
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.

# 당첨 번호 머신
- 중복되지 않는 숫자 6개를 뽑는다.
- 보너스 번호 1개를 뽑는다.

# 당첨 번호
- 당첨은 1등 ~ 5등 까지 있다.
- 1등: 6개 번호 일치, 2,000,000,000원

- 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000 원
- 3등: 5개 번호 일치/ 1,500,000원

- 4등: 4개 번호 일치 / 50,000원
- 5등: 3개 번호 일치 / 5,000원

---

// then

사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
(여기 나중에 다시 제대로 봐야함)

# 출력 

- [ ] 발행한 로또 수량 및 번호를 출력한다.
- [ ] 로또 번호는 오름차순으로 정렬하여 보여준다.
- [ ] 당첨 내역을 출력한다
    - [ ] (일치 개수, 당첨 가격, 몇번 당첨됐는지)
    - [ ] 총 수익률을 계산하여 출력한다.


---
# 예외
## 입력

### 로또 가격
- [x] 로또 가격은 1,000원 단위 입니다.
- [x] 로또 가격은 1,000원 ~ 10,000원 까지 입니다.

### 당첨 번호
- [x] 로또 번호는 서로 중복될 수 없습니다.
- [x] 로또 번호의 숫자 범위는 1~45까지 입니다.
- [x] 로또 번호는 6개여야 합니다.

### 보너스 번호
- [x] 보너스 번호와 당첨번호는 서로 중복될 수 없습니다.
- [x] 로또 번호의 숫자 범위는 1~45까지 입니다.


---

전체 흐름 정리.

구입금액을 입력하면
- 몇개의 로또가 발행됐는지 출력한다.
- 발행 된 모든 로또 숫자 리스트들을 출력한다.

이후

당첨 번호를 입력 하고,

보너스 번호를 입력하면

이후


당첨 통계를 출력하는데,

3개<br>
4개<br>
5개<br>
5개<br>
6개<br>

이 구조는 고정.
총 몇번 당첨 됐는지 기록해야함. 

이후 총 수익률 계산. 


----

- 

