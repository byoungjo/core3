package infPrj.core.discount;

import infPrj.core.member.Grade;
import infPrj.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인")
    void vip_o() {
        Member member = new Member(1L, "memberA", Grade.VIP);
        int discount = discountPolicy.discount(member, 10000);
        assertThat(discount).isEqualTo(1000);
    }
    @Test
    @DisplayName("VIP가 아니면 할인없음")
    void vip_x() {
        Member member = new Member(2L, "memberA", Grade.BASIC);
        int discount = discountPolicy.discount(member, 10000);
        assertThat(discount).isEqualTo(0);
    }
}