package infPrj.core.discount;

import infPrj.core.member.Member;

public interface DiscountPolicy {
    /**
     *
     * @param member
     * @param prince
     * @return 할인 대상 금액
     */
    int discount(Member member, int prince);
}
