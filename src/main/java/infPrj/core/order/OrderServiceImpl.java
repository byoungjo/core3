package infPrj.core.order;

import infPrj.core.discount.DiscountPolicy;
import infPrj.core.discount.FixDiscountPolicy;
import infPrj.core.member.Member;
import infPrj.core.member.MemberRepository;
import infPrj.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
