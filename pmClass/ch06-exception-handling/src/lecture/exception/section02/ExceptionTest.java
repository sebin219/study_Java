package lecture.exception.section02;

import lecture.exception.section02.exception.MoneyNegativeException;
import lecture.exception.section02.exception.NotEnoughMoneyException;
import lecture.exception.section02.exception.PriceNegativeException;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception{
        // 가격이 음수일 때
        if (price<0){
            throw new PriceNegativeException();
        }
        // 갖고 있는 돈이 음수일 때
        if (money<0){
            throw new MoneyNegativeException();
        }
        // 갖고 있는 돈이 부족할 때
        if (money>=price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다!");
        } else {
            throw new NotEnoughMoneyException();
        }

    }
}
